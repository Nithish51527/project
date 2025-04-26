pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Nithish51527/2281A7316.git'
            }
        }
        stage('Build') {
            steps {
             
                bat 'javac Sample.java'
            }
        }
        stage('Test') {
            steps {
                             bat 'java Sample'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add your deployment commands here (like copying files to a server)
            }
        }
Post
{
Success
{
mail to ‘nithishmedi018@gmail.com’,
subject:”Build success”,
Body:’Your build was successfull’
  }
}
   }
}
