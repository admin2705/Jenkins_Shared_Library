def call(String ImageName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockercreds' passwordVariable: 'dockerhubpass' usernameVariable: 'DockerHubUser')]) {
    sh "docker login -u ${DockerHubUer} -p ${dockerhubpass}"
  }
  sh "docker push ${DockerHUbUser}/${ImageName}:${ImageTag}"
}
