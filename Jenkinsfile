pipeline {
  agent { docker 'gradle:3.5-jre8-alpine' }
  stages {
    stage('build') {
      steps {
        sh 'gradlew clean build'
      }
    }
  }
}