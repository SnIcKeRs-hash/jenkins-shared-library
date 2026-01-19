def call(Map config = [:]) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    git url: config.repo, branch: config.branch ?: 'main'
                }
            }
            stage('Build') {
                steps {
                    sh 'echo "Building project..."'
                }
            }
            stage('Test') {
                steps {
                    sh 'echo "Running tests..."'
                }
            }
            stage('Deploy') {
                steps {
                    sh 'echo "Deploying..."'
                }
            }
        }
    }
}
