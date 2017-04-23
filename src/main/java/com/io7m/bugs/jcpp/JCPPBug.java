package com.io7m.bugs.jcpp;

import org.anarres.cpp.LexerException;
import org.anarres.cpp.Preprocessor;

import java.io.File;
import java.io.IOException;

public final class JCPPBug
{
  private JCPPBug()
  {

  }

  public static void main(
    final String[] args)
    throws Exception
  {
    final Preprocessor pp = new Preprocessor();
    pp.addInput(new File("input.txt"));

    while (pp.token() != null);
  }
}
