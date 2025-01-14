pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello from tvp'
            }
        }
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
                        echo "Branch tvp. Este build é de um Pull Request: #${env.CHANGE_ID}"
                    } else {
                        echo "Branch tvp. Este build NÃO é de um Pull Request."
                    }
                }
            }
        }
    }
}
    }
}

