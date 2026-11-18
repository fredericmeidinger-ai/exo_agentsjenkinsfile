pipeline {
    agent any

        stage('Maven Package') {
            agent {
                docker {
                    image 'maven:3.10.0-eclipse-temurin-21'
                    args '''
                        -v $HOME/.m2:/root/.m2:z
                        -u root
                    '''
                    reuseNode true // Permet de partager l'espace de travail entre l'agent Jenkins et l'agent Docker
                }
            }

            steps {
                    sh 'mvn clean package'
                
            }
        }
    }
}