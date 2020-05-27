def dockeruser = "mpsci"
def imagename = "wordpress:5.4.1"
def container = "dockeres_wordpress_1"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/mpsci-iscteiul/ES2-2020-IC1-14.git'
    }
    
stage('Build Docker Image'){
     powershell "docker build -t  ${imagename} ."
    }
    
stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} -p 80:80 ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/wordpress:5.4.1"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerpasswd', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${dockerpasswd}"
    }
    powershell "docker push ${dockeruser}/wordpress:5.4.1"
    }

}