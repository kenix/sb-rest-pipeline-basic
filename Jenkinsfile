#!groovy​

pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        timeout(time: 15, unit: 'MINUTES') {
          checkout scm
          sh 'gradlew clean build'
        }
      }
    }
    stage('Test') {
      steps {
        timeout(time: 15, unit: 'MINUTES') {
          sh 'echo "run test script here"'
        }
      }
    }
  }
  post {
    always {
      echo 'This will always run'
      archive 'build/libs/**/*.jar'
      junit 'build/reports/**/*.xml'
    }
    success {
      echo 'This will run only if successful'
    }
    failure {
      echo 'This will run only if failed'
    }
    unstable {
      echo 'This will run only if the run was marked as unstable'
    }
    changed {
      echo 'This will run only if the state of the Pipeline has changed'
      echo 'For example, if the Pipeline was previously failing but is now successful'
    }
  }
}