def call(String imagename, String ImageTag, String DockerHubUser){
  sh "docker rmi ${DockerHubUser}/${imagename}:${ImageTag}"
}
