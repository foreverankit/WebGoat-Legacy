//noinspection GroovyAssignabilityCheck
pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: "10"))
    }
    agent any
    tools {
        jdk 'jdk11'
        maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
                // git branch: 'master', credentialsId: 'git', url: 'https://github.com/cloudply/cloudply'
                sh 'mvn clean install -U -DskipTests=true'
            }
        }
    }
}
