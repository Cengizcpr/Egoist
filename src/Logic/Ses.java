/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
 
public class Ses {
 
public static void Call(String path)
 {
 
try
 {
 InputStream in=new FileInputStream(path);
 AudioStream as=new AudioStream(in);
 AudioPlayer.player.start(as);
 }
 catch (IOException e)
 {
 System.out.println("Hata :"+e);
 }
 }
 }
