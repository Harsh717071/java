package corejava;

import java.io.*;
import java.util.*;

 class ThreadExample2
{
public static void main(String args[])
{
// Thread object created
// and initiated with data
Thread t = new Thread("HELLO ANUDEEP FOUNDATION!");
// Thread gets started
t.start();
// getting data of
// Thread through String
String s = t.getName();
System.out.println(s);
}
}