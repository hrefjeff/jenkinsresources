pipeline {

  agent {
    label any
    // label label 'master'
  }
  
  stages {
    stage('Pull from somewhere HTTPS') {
      steps {
              checkout([$class: 'GitSCM', 
                branches: [[name: '*/main']],
                doGenerateSubmoduleConfigurations: false,
                extensions: [[$class: 'CleanCheckout']],
                submoduleCfg: [], 
                userRemoteConfigs: [[url: 'https://github.com/naiveskill/devops.git']]])
              sh "ls -ltr"
      }
    }
  }
}
