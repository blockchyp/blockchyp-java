#!groovy
@Library('blockchyp-pipelines') _

pipeline {
  agent {
    docker { image 'maven:3.5-jdk-8-alpine' }
  }

  stages {
    stage('Start') { steps {
      notifySlack 'Started'
    }}
    stage('Build') { steps {
      sh 'mvn clean package'
    }}
  }

  post {
    always {
      junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
      notifySlack()
    }
  }
}
