package org.wen;

// Example library class with native groovy using Pipline steps.

class LibraryClassWithStep {
  def pipeline
  LibraryClassWithStep(pipeline) { this.pipeline = pipeline }

  def goodbye() {
    pipeline.echo "(instance) goodbye world..."
  }

  static def goodbye(pipeline) {
    pipeline.echo "(static) goodbye world..."
  }

}
