pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello from tvp'
            }
        }
        stage('Detect Pull Request') {
            steps {
                script {
                    if (env.CHANGE_ID) {
                        echo "Este build é de um Pull Request: #${env.CHANGE_ID}"
                    } else {
                        echo "Este build NÃO é de um Pull Request."
                    }
                }
            }
        }
    }
}

