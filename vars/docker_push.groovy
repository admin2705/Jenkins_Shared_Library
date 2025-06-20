def call(String ImageName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'docker' passwordVariable: 'dockerhubpass' usernameVariable: 'DockerHubUser')]) {
    sh "docker login -u ${DockerHubUer} -p ${dockerhubpass}"
  }
  sh "docker push ${DockerHUbUser}/${ImageName}:${ImageTag}"
}
