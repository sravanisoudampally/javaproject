pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Compile the Java source files
                sh 'javac -d bin HelloWorld.java HelloWorldTest.java'
            }
        }
        
        stage('Test') {
            steps {
                // Run the test class
                sh 'java -cp bin HelloWorldTest'
            }
        }
        
        stage('Package') {
            steps {
                // Create a JAR file for the project
                sh 'jar cvf HelloWorld.jar -C bin/ .'
            }
        }
    }
    
    post {
        success {
            // If all stages are successful, archive the JAR file
            archiveArtifacts artifacts: 'HelloWorld.jar', onlyIfSuccessful: true
        }
    }
}

