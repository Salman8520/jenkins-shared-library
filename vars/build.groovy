def call(imageName, dockerFileLocation){
  echo "this is building the image"
  sh "sudo apt-get install -y docker.io"
  sh "sudo usermod -aG docker $USER && newgrp docker"
  sh "cd django-todo-cicd/"
  sh "pwd"
  sh "docker build -t ${imageName} ${dockerFileLocation}"
  echo "image built"
}
