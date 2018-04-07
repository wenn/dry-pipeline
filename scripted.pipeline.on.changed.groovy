def successful = currentBuild.getPreviousBuild().result.toString() == "SUCCESS"
def success = true

try {
    node {
        if(successful){
            echo "breaking the build!"
            sh "exit 1"
        } else {
            echo "let the build pass!"
            sh "exit 0"
        }
    }
} catch (exc) {
    success = false
    throw exc
} finally {
    echo successful.toString()
    echo success.toString()
    def changed = successful ^ success

    if(changed && success) {
        currentBuild.displayName = "back to normal!"
    } else if(changed && !success) {
        currentBuild.displayName = "became broken...."
    }
}
