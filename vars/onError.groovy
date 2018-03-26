// User defined step has a `call` method.
def call(Closure block) {
  try {
    block()
  } catch(exc) {
    echo "Something bad happened, but it's handled"
  }
}
