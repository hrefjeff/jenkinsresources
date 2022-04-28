pipeline {

  agent {
    label 'master'
  }
  
  stages {
    stage('Pull from somewhere HTTPS') {
      steps {
        
        withCredentials('something here')
      
      }
    }
  }
}
