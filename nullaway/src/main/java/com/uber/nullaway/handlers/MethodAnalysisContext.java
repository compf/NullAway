package com.uber.nullaway.handlers;

public class MethodAnalysisContext {
  private com.uber.nullaway.NullAway analysis;

  public com.uber.nullaway.NullAway getAnalysis() {
    return analysis;
  }

  public void setAnalysis(com.uber.nullaway.NullAway analysis) {
    this.analysis = analysis;
  }

  private com.google.errorprone.VisitorState state;

  public com.google.errorprone.VisitorState getState() {
    return state;
  }

  public void setState(com.google.errorprone.VisitorState state) {
    this.state = state;
  }

  private com.sun.tools.javac.code.Symbol.MethodSymbol methodSymbol;

  public com.sun.tools.javac.code.Symbol.MethodSymbol getMethodSymbol() {
    return methodSymbol;
  }

  public void setMethodSymbol(com.sun.tools.javac.code.Symbol.MethodSymbol methodSymbol) {
    this.methodSymbol = methodSymbol;
  }

  public MethodAnalysisContext(
      com.uber.nullaway.NullAway analysis,
      com.google.errorprone.VisitorState state,
      com.sun.tools.javac.code.Symbol.MethodSymbol methodSymbol) {
    this.analysis = analysis;
    this.state = state;
    this.methodSymbol = methodSymbol;
  }
}
