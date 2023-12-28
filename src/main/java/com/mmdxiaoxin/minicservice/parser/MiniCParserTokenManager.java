/* Generated By:JJTree&JavaCC: Do not edit this line. MiniCParserTokenManager.java */
package com.mmdxiaoxin.minicservice.parser;
import com.mmdxiaoxin.minicservice.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/** Token Manager. */
public class MiniCParserTokenManager implements MiniCParserConstants
{

  /** Debug output. */
  public  PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4100000000000000L) != 0L)
            return 51;
         if ((active1 & 0x100000L) != 0L)
            return 4;
         if ((active0 & 0xffffffff8000L) != 0L)
         {
            jjmatchedKind = 85;
            return 30;
         }
         return -1;
      case 1:
         if ((active0 & 0xdfffff7e8000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 85;
               jjmatchedPos = 1;
            }
            return 30;
         }
         if ((active0 & 0x200000810000L) != 0L)
            return 30;
         return -1;
      case 2:
         if ((active0 & 0x440000L) != 0L)
            return 30;
         if ((active0 & 0xffffff3a8000L) != 0L)
         {
            jjmatchedKind = 85;
            jjmatchedPos = 2;
            return 30;
         }
         return -1;
      case 3:
         if ((active0 & 0xb7f5ed088000L) != 0L)
         {
            jjmatchedKind = 85;
            jjmatchedPos = 3;
            return 30;
         }
         if ((active0 & 0x480a12320000L) != 0L)
            return 30;
         return -1;
      case 4:
         if ((active0 & 0xa3b4e9080000L) != 0L)
         {
            jjmatchedKind = 85;
            jjmatchedPos = 4;
            return 30;
         }
         if ((active0 & 0x144104008000L) != 0L)
            return 30;
         return -1;
      case 5:
         if ((active0 & 0x2130a1080000L) != 0L)
            return 30;
         if ((active0 & 0x828448000000L) != 0L)
         {
            jjmatchedKind = 85;
            jjmatchedPos = 5;
            return 30;
         }
         return -1;
      case 6:
         if ((active0 & 0x28408000000L) != 0L)
         {
            jjmatchedKind = 85;
            jjmatchedPos = 6;
            return 30;
         }
         if ((active0 & 0x800040000000L) != 0L)
            return 30;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 81;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10L);
      case 35:
         return jjStopAtPos(0, 80);
      case 37:
         jjmatchedKind = 57;
         return jjMoveStringLiteralDfa1_0(0x8000000000000000L, 0x0L);
      case 38:
         jjmatchedKind = 82;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40L);
      case 40:
         return jjStopAtPos(0, 74);
      case 41:
         return jjStopAtPos(0, 75);
      case 42:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x2000000000000000L, 0x0L);
      case 43:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x800000000000000L, 0x0L);
      case 44:
         return jjStopAtPos(0, 72);
      case 45:
         jjmatchedKind = 54;
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L, 0x0L);
      case 46:
         return jjStartNfaWithStates_0(0, 84, 4);
      case 47:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L, 0x0L);
      case 58:
         return jjStopAtPos(0, 73);
      case 59:
         return jjStopAtPos(0, 71);
      case 60:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2L);
      case 61:
         return jjStopAtPos(0, 58);
      case 62:
         jjmatchedKind = 66;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8L);
      case 91:
         return jjStopAtPos(0, 78);
      case 93:
         return jjStopAtPos(0, 79);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800000000L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x40400a000000L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0xa00000800000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1200020000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000400000L, 0x0L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x10000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x50000L, 0x0L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80000000000L, 0x0L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x200000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400080000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x520a1000000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x40000000L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x20100000000L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x8000100000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 77);
      case 124:
         jjmatchedKind = 83;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20L);
      case 125:
         return jjStopAtPos(0, 76);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(1, 70);
         break;
      case 61:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         else if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         else if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         else if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         else if ((active1 & 0x2L) != 0L)
            return jjStopAtPos(1, 65);
         else if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         else if ((active1 & 0x10L) != 0L)
            return jjStopAtPos(1, 68);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2200000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800400080000L, active1, 0L);
      case 102:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 30);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x440000008000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x10020000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000020000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x20300040000L, active1, 0L);
      case 111:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x28c018500000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2080000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L, active1, 0L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L, active1, 0L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L, active1, 0L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L, active1, 0L);
      case 124:
         if ((active1 & 0x20L) != 0L)
            return jjStopAtPos(1, 69);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x402000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x101308000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x84008000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x140000000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 30);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x20002020000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 30);
         return jjMoveStringLiteralDfa3_0(active0, 0x1810080000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x200200000000L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x908004000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      case 100:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 30);
         break;
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 30);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 30);
         return jjMoveStringLiteralDfa4_0(active0, 0x1060000000L);
      case 103:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 30);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x20400000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 109:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 30);
         break;
      case 110:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 30);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 111:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 30);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 30);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 114:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 30);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2009000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80080000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x81000000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 30);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x2008000000L);
      case 107:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 30);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 30);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000080000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 30);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 42, 30);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 44, 30);
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 30);
         break;
      case 100:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 40, 30);
         break;
      case 101:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 30);
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000L);
      case 102:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 29, 30);
         break;
      case 104:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 30);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000000L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 30);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 36, 30);
         return jjMoveStringLiteralDfa6_0(active0, 0x20008000000L);
      case 116:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 30);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x20400000000L);
      case 102:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(6, 30, 30);
         break;
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      case 116:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 47, 30);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 41, 30);
         break;
      case 101:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 27, 30);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 39, 30);
         break;
      case 114:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(7, 34, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 62;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  else if (curChar == 47)
                     jjAddStates(7, 8);
                  else if (curChar == 34)
                     jjCheckNAddStates(9, 11);
                  else if (curChar == 39)
                     jjAddStates(12, 13);
                  else if (curChar == 46)
                     jjCheckNAdd(4);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(14, 16);
                  }
                  break;
               case 51:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(57, 58);
                  else if (curChar == 47)
                     jjCheckNAddStates(17, 19);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(20, 22);
                  break;
               case 6:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if (curChar == 39)
                     jjAddStates(12, 13);
                  break;
               case 10:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 11:
                  if (curChar == 39 && kind > 13)
                     kind = 13;
                  break;
               case 13:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 14:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 11);
                  break;
               case 15:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 16:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 18:
                  if (curChar == 34)
                     jjCheckNAddStates(9, 11);
                  break;
               case 19:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 21:
                  if ((0x8400002400L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 22:
                  if (curChar == 34 && kind > 14)
                     kind = 14;
                  break;
               case 23:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 24:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 25:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(24);
                  break;
               case 27:
                  if (curChar == 10)
                     jjCheckNAddStates(9, 11);
                  break;
               case 28:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 85)
                     kind = 85;
                  jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 33:
                  if (curChar != 46)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(27, 29);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(27, 29);
                  break;
               case 36:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(37, 8);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 39);
                  break;
               case 40:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(41);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(41, 8);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(30, 32);
                  break;
               case 44:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(45, 8);
                  break;
               case 46:
                  if (curChar != 48)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(14, 16);
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(48, 2);
                  break;
               case 49:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(49, 2);
                  break;
               case 50:
                  if (curChar == 47)
                     jjAddStates(7, 8);
                  break;
               case 52:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(17, 19);
                  break;
               case 53:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 54:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 55:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 56:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(57, 58);
                  break;
               case 57:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(57, 58);
                  break;
               case 58:
                  if (curChar == 42)
                     jjCheckNAddStates(33, 35);
                  break;
               case 59:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(60, 58);
                  break;
               case 60:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(60, 58);
                  break;
               case 61:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 85)
                     kind = 85;
                  jjCheckNAdd(30);
                  break;
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 5:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(36, 37);
                  break;
               case 8:
                  if ((0x5000000050L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 10:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 12:
                  if (curChar == 92)
                     jjAddStates(38, 40);
                  break;
               case 13:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 19:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 20:
                  if (curChar == 92)
                     jjAddStates(41, 44);
                  break;
               case 21:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(45, 46);
                  break;
               case 39:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(47, 48);
                  break;
               case 43:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(49, 50);
                  break;
               case 47:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(48);
                  break;
               case 48:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(48, 2);
                  break;
               case 52:
                  jjAddStates(17, 19);
                  break;
               case 57:
                  jjCheckNAddTwoStates(57, 58);
                  break;
               case 59:
               case 60:
                  jjCheckNAddTwoStates(60, 58);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(9, 11);
                  break;
               case 52:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(17, 19);
                  break;
               case 57:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(57, 58);
                  break;
               case 59:
               case 60:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(60, 58);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 62 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   32, 33, 38, 39, 42, 43, 8, 51, 56, 19, 20, 22, 10, 12, 47, 49, 
   2, 52, 53, 55, 4, 5, 8, 19, 20, 24, 22, 34, 35, 8, 42, 43, 
   8, 58, 59, 61, 6, 7, 13, 14, 16, 21, 23, 25, 28, 36, 37, 40, 
   41, 44, 45, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\167\150\151\154\145", "\151\146", "\145\154\163\145", "\151\156\164", 
"\162\145\164\165\162\156", "\166\157\151\144", "\155\141\151\156", "\146\157\162", "\144\157", 
"\163\167\151\164\143\150", "\143\141\163\145", "\142\162\145\141\153", 
"\143\157\156\164\151\156\165\145", "\147\157\164\157", "\163\151\172\145\157\146", 
"\164\171\160\145\144\145\146", "\163\164\162\165\143\164", "\165\156\151\157\156", "\145\156\165\155", 
"\162\145\147\151\163\164\145\162", "\141\165\164\157", "\145\170\164\145\162\156", "\163\164\141\164\151\143", 
"\143\157\156\163\164", "\166\157\154\141\164\151\154\145", "\163\151\147\156\145\144", 
"\165\156\163\151\147\156\145\144", "\163\150\157\162\164", "\154\157\156\147", "\146\154\157\141\164", 
"\144\157\165\142\154\145", "\143\150\141\162", "\144\145\146\141\165\154\164", null, null, null, null, 
null, "\53", "\55", "\52", "\57", "\45", "\75", "\53\75", "\55\75", "\52\75", 
"\57\75", "\45\75", "\74", "\74\75", "\76", "\76\75", "\41\75", "\174\174", "\46\46", 
"\73", "\54", "\72", "\50", "\51", "\175", "\173", "\133", "\135", "\43", "\41", 
"\46", "\174", "\56", null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffe0ffffffffe881L, 0x3fffffL, 
};
static final long[] jjtoSkip = {
   0x7eL, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[62];
private final int[] jjstateSet = new int[124];
protected char curChar;
/** Constructor. */
public MiniCParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public MiniCParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 62; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
