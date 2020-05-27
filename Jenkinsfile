def dockeruser = "mpsci"
def imagename = "openjdk:8"
def container = "grupo14"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/mpsci-iscteiul/ES2-2020-IC1-14.git'
    }
    
stage('Build Docker Imagae'){
     powershell "docker build -t  ${imagename} ."
    }
    
stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} -p 8014:80 ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/grupo14"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerpasswd', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${dockerpasswd}"
    }
    powershell "docker push ${dockeruser}/grupo14"
    }

}
