#!/usr/bin/env groovy
package com.packages

class GlobalClass {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.packages.GlobalClass
   // println GlobalClass.foo
}