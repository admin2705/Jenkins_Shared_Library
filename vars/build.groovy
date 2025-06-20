def call(String ImageName, String ImageTag, String DockerHUbUSer){
 sh " docker build -t ${DockerHubUser}/${ImageNAme}:${ImageTAG} ."
}
