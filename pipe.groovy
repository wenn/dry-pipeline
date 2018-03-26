@Library('wen') _
import org.wen.LibraryClass
import org.wen.LibraryClassWithStep

def libClass = new LibraryClass()
def libClassWithStep = new LibraryClassWithStep(this)
def classlessStep = new org.wen.ClasslessStep()


node {
    /** (src) Library class usages */
    // classless library step
    classlessStep.whereAmI()

    // native groovy library class
    echo libClass.goodbye()

    // library class with steps
    libClassWithStep.goodbye()
    LibraryClassWithStep.goodbye(this)

    /** (vars) Global variables usage */
    // global variables, refer with `log` from `log.groovy`
    log.info("nothing special")
    log.error("something bad")

    // user defined global step with closure from `onError.groovy`
    onError {
      sh "ls dir_does_not_exists"
    }

}
