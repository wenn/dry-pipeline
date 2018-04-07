def hasChanged = false

pipeline {
    agent any
    stages {
        stage("Toggle build status.") {
            steps {
                script {
                    def successful = currentBuild.getPreviousBuild().result.toString() == "SUCCESS"
                    if(successful){
                        echo "breaking the build!"
                        sh "exit 1"
                    } else {
                        echo "let the build pass!"
                        sh "exit 0"
                    }
                }
            }
        }
    }
    post {
        changed {
            script {
                hasChanged = true
            }
        }
        success {
            script {
                if(hasChanged){
                    currentBuild.displayName = "back to normal!"
                }
            }

        }
        failure {
            script {
                if(hasChanged){
                    currentBuild.displayName = "became broken...."
                }
            }
        }
    }
}
