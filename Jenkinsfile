#!groovy​

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        timeout(time: 10, unit: 'MINUTES') {
          sh 'gradlew clean build'
        }
      }
    }
    stage('Test') {
      steps {
        echo 'Testing'
      }
    }
    stage('Deploy - staging') {
      steps {
        echo 'Deploy to staging'
      }
    }
    stage('Sanity check') {
      steps {
        input "Does the staging environment look ok?"
      }
    }
    stage('Deploy - Production') {
      steps {
        echo 'Deploy to production'
      }
    }
  }
  post {
    always {
      echo 'This will always run'
      junit 'build/test-results/**/*.xml'
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