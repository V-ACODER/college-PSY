package cn.edu.hevttc.psy.strategies;

import java.util.*;
import java.sql.*;
public class Calculate {
		int[] score = new int[187];
		int[] arrayA = {3,26,27,51,52,76,101,126,151,176};
		int[] arrayB = {28,53,54,77,78,102,103,127,128,152,153,177,178,180};
		int[] arrayC = {4,5,29,30,55,79,80,104,105,129,130,154,179};
		int[] arrayE = {6,7,32,56,57,81,106,131,155,156,180,181};
		int[] arrayF = {8,33,58,82,83,107,108,132,133,157,158,182,183};
		int[] arrayG = {9,34,59,84,109,134,159,160,184,185};
		int[] arrayH = {10,35,36,60,61,85,86,110,111,135,136,161,186};
		int[] arrayI = {11,12,37,62,87,112,137,138,162,163};
		int[] arrayL = {13,38,63,64,88,89,113,114,139,164};
		int[] arrayM = {14,15,39,40,65,90,91,115,116,140,141,165,166};
		int[] arrayN = {16,17,41,42,66,67,92,117,142,167};
		int[] arrayO = {18,19,43,44,68,69,93,94,118,119,143,144,168};
		int[] arrayQ1 = {20,21,45,46,70,95,120,145,169,170};
		int[] arrayQ2 = {22,47,71,72,96,97,121,122,146,171};
		int[] arrayQ3 = {23,24,48,73,98,123,147,148,172,173};
		int[] arrayQ4 = {25,49,50,74,75,99,100,124,125,149,150,174,175};
		int elementA = 0;
		int elementB = 0;
		int elementC = 0;
		int elementE = 0;
		int elementF = 0;
		int elementG = 0;
		int elementH = 0;
		int elementI = 0;
		int elementL = 0;
		int elementM = 0;
		int elementN = 0;
		int elementO = 0;
		int elementQ1 = 0;
		int elementQ2= 0;
		int elementQ3= 0;
		int elementQ4= 0;
		public Calculate(int[] score){
			this.score = score;
		}
		public int calcul(int[] array,int[] score){
				int sum=0;
				for(int i=0;i<array.length;i++){
					sum = sum+score[array[i]];
				}
				return sum;
		}
		public String elementA(){
		String stringA = "";
		int priA = calcul(arrayA,score);
		switch (priA){
		case 0:
		case 1:
			elementA = 1;
			break;
		case 2:
		case 3:
			elementA = 2;
			break;
		case 4:
		case 5:
			elementA = 3;
	     	break;
		case 6:
		    elementA = 4;
		    break;
		case 7:
		case 8:
			elementA = 5;
			break;
		case 9:
		case 10:
		case 11:
			elementA = 6;
			break;
		case 12:
		case 13:
			elementA = 7;
			break;
		case 14:
			elementA = 8;
			break;
		case 15:
		case 16:
			elementA = 9;
			break;
		default:
			elementA = 10;
		}
		if(elementA<=3){
			stringA = "���ģ���Ⱥ�ԣ��ǵͷ���������Ĭ���¶�����Į��";
		}
		else if(elementA>=8){
			stringA = "���ģ���Ⱥ�ԣ��Ǹ߷��������������飬��Ⱥ��";
		}
		else{
		    stringA = "��Ⱥ�Եͷ������Ǽ�Ĭ���¶�����Į���߷��������������飬��Ⱥ���������м�״̬";
		}
		return stringA;
		}
		public String elementB(){
			String stringB = "";
			int priB = calcul(arrayB,score);
			switch (priB){
			case 0:
			case 1:
			case 2:
			case 3:
				elementB = 1;
				break;
			case 4:
				elementB = 2;
				break;
			case 5:
				elementB = 3;
		     	break;
			case 6:
			    elementB = 4;
			    break;
			case 7:
				elementB = 5;
				break;
			case 8:
				elementB = 6;
				break;
			case 9:
				elementB = 7;
				break;
			case 10:
				elementB = 8;
				break;
			case 11:
				elementB = 9;
				break;
	        default:
				elementB = 10;
			}
			if(elementB<=3){
				stringB = "���ģ��ϻ��ԣ��ǵͷ�������֪ʶ��Ƚ�խ������˼�������Ƚ�����";
			}
			else if(elementB>=8){
				stringB = "���ģ��ϻ��ԣ��Ǹ߷����������в�ʶ�����ڳ���˼����ѧϰ����ǿ��˼ά���ݡ�";
			}
			else{
			    stringB = "�ϻ��Եĵͷ�������֪ʶ��Ƚ�խ������˼�������Ƚ������߷������Ǹ��в�ʶ�����ڳ���˼����ѧϰ����ǿ��˼ά���ݡ��������м�״̬";
			}
			return stringB;
		}
		public String elementC(){
			String stringC = "";
			int priC = calcul(arrayC,score);
			switch (priC){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				elementC = 1;
				break;
			case 6:
			case 7:
				elementC = 2;
				break;
			case 8:
			case 9:
				elementC = 3;
		     	break;
			case 10:
			case 11:
			    elementC = 4;
			    break;
			case 12:
			case 13:
				elementC = 5;
				break;
			case 14:
			case 15:
			case 16:
				elementC = 6;
				break;
			case 17:
			case 18:
				elementC = 7;
				break;
			case 19:
			case 20:
				elementC = 8;
				break;
			case 21:
			case 22:
				elementC = 9;
				break;
	        default:
				elementC = 10;
			}
			if(elementC<=3){
				stringC = "���ģ��ȶ��ԣ��ǵͷ������������������������գ�����ҡ���������ܻ���֧�䡣";
			}
			else if(elementC>=8){
				stringC = "���ģ��ȶ��ԣ��Ǹ߷������������ȶ������죬�������ʵ��";
			}
			else{
			    stringC = "�ȶ��Եĵͷ������������������������գ�����ҡ���������ܻ���֧�䣻�߷������������ȶ������죬�������ʵ���������м�״̬";
			}
			return stringC;
		}
		public String elementE(){
			String stringE = "";
			int priE = calcul(arrayE,score);
			switch (priE){
			case 0:
			case 1:
			case 2:
				elementE = 1;
				break;
			case 3:
			case 4:
				elementE = 2;
				break;
			case 5:
				elementE = 3;
		     	break;
			case 6:
			case 7:
			    elementE = 4;
			    break;
			case 8:
			case 9:
				elementE = 5;
				break;
			case 10:
			case 11:
			case 12:
				elementE = 6;
				break;
			case 13:
			case 14:
				elementE = 7;
				break;
			case 15:
			case 16:
				elementE = 8;
				break;
			case 17:
			case 18:
				elementE = 9;
				break;
	        default:
				elementE = 10;
			}
			if(elementE<=3){
				stringE = "���ģ���ǿ�ԣ��ǵͷ�������ǫѷ��˳�ӣ�ͨ�ڣ���˳��";
			}
			else if(elementE>=8){
				stringE = "���ģ���ǿ�ԣ��Ǹ߷���������ǿ��ִ������������";
			}
			else{
			    stringE = "��ǿ�Եĵͷ�������ǫѷ��˳�ӣ�ͨ�ڣ���˳���߷������Ǻ�ǿ��ִ�������������������м�״̬";
			}
			return stringE;
		}
		public String elementF(){
			String stringF = "";
		int priF = calcul(arrayF,score);
		switch (priF){
		case 0:
		case 1:
		case 2:
		case 3:
			elementF = 1;
			break;
		case 4:
			elementF = 2;
			break;
		case 5:
		case 6:
			elementF = 3;
	     	break;
		case 7:
		    elementF = 4;
		    break;
		case 8:
		case 9:
			elementF = 5;
			break;
		case 10:
		case 11:
		case 12:
			elementF = 6;
			break;
		case 13:
		case 14:
			elementF = 7;
			break;
		case 15:
		case 16:
			elementF = 8;
			break;
		case 17:
		case 18:
			elementF = 9;
			break;
        default:
			elementF = 10;
		}
		if(elementF<=3){
			stringF = "���ģ��˷��ԣ��ǵͷ����������࣬�������侲�����ԡ�";
		}
		else if(elementF>=8){
			stringF = "���ģ��˷��ԣ��Ǹ߷������������˷ܣ�����������";
		}
		else{
		    stringF = "�˷��Եĵͷ����������࣬�������侲�����ԣ��߷������������˷ܣ����������������м�״̬";
		}
		return stringF;
		}
		public String elementG(){
			String stringG = "";
			int priG = calcul(arrayG,score);
			switch (priG){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				elementG = 1;
				break;
			case 6:
			case 7:
				elementG = 2;
				break;
			case 8:
			case 9:
				elementG = 3;
		     	break;
			case 10:
			    elementG = 4;
			    break;
			case 11:
			case 12:
				elementG = 5;
				break;
			case 13:
			case 14:
				elementG = 6;
				break;
			case 15:
			case 16:
				elementG = 7;
				break;
			case 17:
				elementG = 8;
				break;
			case 18:
				elementG = 9;
				break;
	        default:
				elementG = 10;
			}
			if(elementG<=3){
				stringG = "���ģ��к��ԣ��ǵͷ����������ҷ��ܣ�ȱ����ط��ľ���";
			}
			else if(elementG>=8){
				stringG = "���ģ��к��ԣ��Ǹ߷��������к㸺�����¾���";
			}
			else{
			    stringG = "�к��Եĵͷ������ǹ��ҷ��ܣ�ȱ����ط��ľ��񣻸߷��������к㸺�����¾��������м�״̬";
			}
			return stringG;
		}
		public String elementH(){
			String stringH = "";
			int priH = calcul(arrayH,score);
			switch (priH){
			case 0:
			case 1:
				elementH = 1;
				break;
			case 2:
				elementH = 2;
				break;
			case 3:
				elementH = 3;
		     	break;
			case 4:
			case 5:
			case 6:
			    elementH = 4;
			    break;
			case 7:
			case 8:
				elementH = 5;
				break;
			case 9:
			case 10:
			case 11:
				elementH = 6;
				break;
			case 12:
			case 13:
			case 14:
				elementH = 7;
				break;
			case 15:
			case 16:
				elementH = 8;
				break;
			case 17:
			case 18:
			case 19:
				elementH = 9;
				break;
	        default:
				elementH = 10;
			}
			if(elementH<=3){
				stringH = "���ģ���Ϊ�ԣ��ǵͷ�������η������ȱ�������ġ�";
			}
			else if(elementH>=8){
				stringH = "���ģ���Ϊ�ԣ��Ǹ߷�������ð�ո�Ϊ�����й˼ɡ�";
			}
			else{
			    stringH = "��Ϊ�Եĵͷ�������η������ȱ�������ģ��߷�������ð�ո�Ϊ�����й˼ɡ������м�״̬";
			}
			return stringH;
		}
		public String elementI(){
			String stringI = "";
		int priI = calcul(arrayI,score);
		switch (priI){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			elementI = 1;
			break;
		case 6:
			elementI = 2;
			break;
		case 7:
		case 8:
			elementI = 3;
	     	break;
		case 9:
		    elementI = 4;
		    break;
		case 10:
		case 11:
			elementI = 5;
			break;
		case 12:
		case 13:
			elementI = 6;
			break;
		case 14:
			elementI = 7;
			break;
		case 15:
		case 16:
			elementI = 8;
			break;
		case 17:
			elementI = 9;
			break;
        default:
			elementI = 10;
		}
		if(elementI<=3){
			stringI = "���ģ������ԣ��ǵͷ����������ǣ�������ʵ����ʳ������";
		}
		else if(elementI>=8){
			stringI = "���ģ������ԣ��Ǹ߷����������У��������¡�";
		}
		else{
		    stringI = "�����Եĵͷ������ǹ����ǣ�������ʵ����ʳ�������߷����������У��������¡������м�״̬";
		}
		return stringI;
		}
		public String elementL(){
			String stringL = "";
		int priL = calcul(arrayL,score);
		switch (priL){
		case 0:
		case 1:
		case 2:
		case 3:
			elementL = 1;
			break;
		case 4:
		case 5:
			elementL = 2;
			break;
		case 6:
			elementL = 3;
	     	break;
		case 7:
		case 8:
		    elementL = 4;
		    break;
		case 9:
		case 10:
			elementL = 5;
			break;
		case 11:
		case 12:
			elementL = 6;
			break;
		case 13:
			elementL = 7;
			break;
		case 14:
		case 15:
			elementL = 8;
			break;
		case 16:
			elementL = 9;
			break;
        default:
			elementL = 10;
		}
		if(elementL<=3){
			stringL = "���ģ������ԣ��ǵͷ����������ǣ�������ʵ����ʳ������";
		}
		else if(elementL>=8){
			stringL = "���ģ������ԣ��Ǹ߷����������У��������¡�";
		}
		else{
		    stringL = "�����Եĵͷ������ǹ����ǣ�������ʵ����ʳ�������߷����������У��������¡������м�״̬";
		}
		return stringL;
		}
		public String elementM(){
			String stringM = "";
		int priM = calcul(arrayM,score);
		switch (priM){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			elementM = 1;
			break;
		case 6:
		case 7:
			elementM = 2;
			break;
		case 8:
		case 9:
			elementM = 3;
	     	break;
		case 10:
		case 11:
		    elementM = 4;
		    break;
		case 12:
		case 13:
			elementM = 5;
			break;
		case 14:
		case 15:
			elementM = 6;
			break;
		case 16:
		case 17:
			elementM = 7;
			break;
		case 18:
		case 19:
			elementM = 8;
			break;
		case 20:
			elementM = 9;
			break;
        default:
			elementM = 10;
		}
		if(elementM<=3){
			stringM = "���ģ������ԣ��ǵͷ���������ʵ���Ϻ��ɹ棬�������ƺ���";
		}
		else if(elementM>=8){
			stringM = "���ģ������ԣ��Ǹ߷�����������ģ���Ų��";
		}
		else{
		    stringM = "�����Եĵͷ���������ʵ���Ϻ��ɹ棬�������ƺ����߷������ǻ���ģ���Ų�������м�״̬";
		}
		return stringM;
		}
		public String elementN(){
			String stringN = "";
		int priN = calcul(arrayN,score);
		switch (priN){
		case 0:
		case 1:
		case 2:
			elementN = 1;
			break;
		case 3:
			elementN = 2;
			break;
		case 4:
			elementN = 3;
	     	break;
		case 5:
		case 6:
		    elementN = 4;
		    break;
		case 7:
		case 8:
			elementN = 5;
			break;
		case 9:
		case 10:
			elementN = 6;
			break;
		case 11:
			elementN = 7;
			break;
		case 12:
		case 13:
			elementN = 8;
			break;
		case 14:
			elementN = 9;
			break;
        default:
			elementN = 10;
		}
		if(elementN<=3){
			stringN = "���ģ������ԣ��ǵͷ�������̹�ף�ֱ�ʣ����档";
		}
		else if(elementN>=8){
			stringN = "���ģ������ԣ��Ǹ߷������������ܸɣ����ʡ�";
		}
		else{
		    stringN = "�����Եĵͷ�������̹�ף�ֱ�ʣ����棻�߷������Ǿ����ܸɣ����ʡ������м�״̬";
		}
		return stringN;
		}
		public String elementO(){
			String stringO="";
		int priO = calcul(arrayO,score);
		switch (priO){
		case 0:
		case 1:
		case 2:
			elementO = 1;
			break;
		case 3:
		case 4:
			elementO = 2;
			break;
		case 5:
		case 6:
			elementO = 3;
	     	break;
		case 7:
		case 8:
		    elementO = 4;
		    break;
		case 9:
		case 10:
			elementO = 5;
			break;
		case 11:
		case 12:
			elementO = 6;
			break;
		case 13:
		case 14:
			elementO = 7;
			break;
		case 15:
		case 16:
			elementO = 8;
			break;
		case 17:
		case 18:
			elementO = 9;
			break;
        default:
			elementO = 10;
		}
		if(elementO<=3){
			stringO = "���ģ������ԣ��ǵͷ����������꣬���ţ��������ġ�";
		}
		else if(elementO>=8){
			stringO = "���ģ������ԣ��Ǹ߷������������������������š�";
		}
		else{
		    stringO = "�����Եĵͷ������ǰ��꣬���ţ��������ģ��߷������������������������š������м�״̬";
		}
		return stringO;
		}
		public String elementQ1(){
			String stringQ1="";
		int priQ1 = calcul(arrayQ1,score);
		switch (priQ1){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			elementQ1= 1;
			break;
		case 5:
			elementQ1= 2;
			break;
		case 6:
		case 7:
			elementQ1= 3;
	     	break;
		case 8:
		    elementQ1= 4;
		    break;
		case 9:
		case 10:
			elementQ1= 5;
			break;
		case 11:
		case 12:
			elementQ1= 6;
			break;
		case 13:
			elementQ1= 7;
			break;
		case 14:
			elementQ1= 8;
			break;
		case 15:
			elementQ1= 9;
			break;
        default:
			elementQ1= 10;
		}
		if(elementQ1<=3){
			stringQ1 = "���ģ�ʵ���ԣ��ǵͷ����������صģ����ش�ͳ��������Ϊ��׼��";
		}
		else if(elementQ1>=8){
			stringQ1 = "���ģ�ʵ���ԣ��Ǹ߷����������ɵģ���������������������ʵ��";
		}
		else{
		    stringQ1 = "ʵ���Եĵͷ������ǰ��꣬���ţ��������ģ��߷������������������������š������м�״̬";
		}
		return stringQ1;
		}
		public String elementQ2(){
			String stringQ2="";
		int priQ2 = calcul(arrayQ2,score);
		switch (priQ2){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			elementQ2= 1;
			break;
		case 6:
		case 7:
			elementQ2= 2;
	     	break;
		case 8:
		    elementQ2= 3;
		    break;
		case 9:
		case 10:
			elementQ2= 4;
			break;
		case 11:
		case 12:
			elementQ2= 5;
			break;
		case 13:
		case 14:
			elementQ2= 6;
			break;
		case 15:
			elementQ2= 7;
			break;
		case 16:
		case 17:
			elementQ2= 8;
			break;
		case 18:
			elementQ2= 9;
			break;
        default:
			elementQ2= 10;
		}
		if(elementQ2<=3){
			stringQ2 = "���ģ������ԣ��ǵͷ���������������Ⱥ���ڡ�";
		}
		else if(elementQ2>=8){
			stringQ2 = "���ģ������ԣ��Ǹ߷�������������ǿ���������ϡ�";
		}
		else{
		    stringQ2 = "�����Եĵͷ���������������Ⱥ���ڣ��߷�������������ǿ���������ϡ������м�״̬";
		}
		return stringQ2;
		}
		public String elementQ3(){
			String stringQ3="";
		int priQ3 = calcul(arrayQ3,score);
		switch (priQ3){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			elementQ3= 1;
			break;
		case 5:
		case 6:
			elementQ3= 2;
			break;
		case 7:
		case 8:
			elementQ3= 3;
	     	break;
		case 9:
		case 10:
		    elementQ3= 4;
		    break;
		case 11:
		case 12:
			elementQ3= 5;
			break;
		case 13:
		case 14:
			elementQ3= 6;
			break;
		case 15:
			elementQ3= 7;
			break;
		case 16:
		case 17:
			elementQ3= 8;
			break;
		case 18:
			elementQ3= 9;
			break;
        default:
			elementQ3= 10;
		}
		if(elementQ3<=3){
			stringQ3 = "���ģ������ԣ��ǵͷ�������ì�ܳ�ͻ�����˴��塣";
		}
		else if(elementQ3>=8){
			stringQ3 = "���ģ������ԣ��Ǹ߷�������֪��֪�ˣ������Ͻ���";
		}
		else{
		    stringQ3 = "�����Եĵͷ�������ì�ܳ�ͻ�����˴��壻�߷�������֪��֪�ˣ������Ͻ��������м�״̬";
		}
		return stringQ3;
		}
		public String elementQ4(){
			String stringQ4="";
		int priQ4 = calcul(arrayQ4,score);
		switch (priQ4){
		case 0:
		case 1:
		case 2:
			elementQ4= 1;
			break;
		case 3:
		case 4:
			elementQ4= 2;
			break;
		case 5:
		case 6:
			elementQ4= 3;
	     	break;
		case 7:
		case 8:
		    elementQ4= 4;
		    break;
		case 9:
		case 10:
		case 11:
			elementQ4= 5;
			break;
		case 12:
		case 13:
		case 14:
			elementQ4= 6;
			break;
		case 15:
		case 16:
			elementQ4= 7;
			break;
		case 17:
		case 18:
		case 19:
			elementQ4= 8;
			break;
		case 20:
		case 21:
			elementQ4= 9;
			break;
        default:
			elementQ4= 10;
		}
		if(elementQ4<=3){
			stringQ4 = "���ģ������ԣ��ǵͷ�����������ƽ�ͣ���ɢ������";
		}
		else if(elementQ4>=8){
			stringQ4 = "���ģ������ԣ��Ǹ߷��������������ţ�����������";
		}
		else{
		    stringQ4 = "�����Եĵͷ�����������ƽ�ͣ���ɢ�������߷������ǽ������ţ����������������м�״̬";
		}
		return stringQ4;
		}
	public String X1(){
		int X1;
		String Xs1 = "";
		X1= ((38+2*elementL+3*elementO+4*elementQ4)-(2*elementC+2*elementH+2*elementQ2))/10;
		if(X1<=3){
			Xs1="��Ӧ�ڽ����ͣ����ǵͷ�������������Ӧ˳����ͨ���е��������㣬�������������ļ�����Ϊ��Ҫ�����顣��������ͣ�����ܶ����ѵĹ���ȱ��������������֪�Ѷ��ˣ����Ϸܶ�Ŭ��������";
		}else if(X1>=8){
			Xs1="��Ӧ�ڽ����ͣ����Ǹ߷���������һ������֢����Ϊ���������龳�Եģ���Ҳ������һЩ���ڲ����������������������Ҫ��ĺ��Լ�������ɵ����鳣�е������⡣�߶ȵĽ��ǿ��ܻ�ʹ�����ܵ��ƻ���Ӱ�����彡����";
		}
		else{
			Xs1="��Ӧ�ڽ����͵ͷ�������������Ӧ˳����ͨ���е��������㣬�������������ļ�����Ϊ��Ҫ�����顣��������ͣ�����ܶ����ѵĹ���ȱ��������������֪�Ѷ��ˣ����Ϸܶ�Ŭ�������򡣸߷���������һ������֢����Ϊ���������龳�Եģ���Ҳ������һЩ���ڲ����������������������Ҫ��ĺ��Լ�������ɵ����鳣�е������⡣�߶ȵĽ��ǿ��ܻ�ʹ�����ܵ��ƻ���Ӱ�����彡���������м�״̬��";
		}
		return Xs1;
	}
	public String X2(){
		int X2;
		String Xs2 = "";
		X2= ((2*elementA+3*elementE+4*elementF+5*elementH)-(2*elementQ2+11))/10;
		if(X2<=3){
			Xs2="�������������ͣ����ǵͷ����������㣬���ڵ�С�����㣬������˽Ӵ��в�ȡ����̬�ȣ������ڴ��¾�ϸ������������������ν���ף���Ҫȡ��������������²�ȡ����̬�ȡ�";
		}else if(X2>=8){
			Xs2="�������������ͣ����Ǹ߷����������㣬���ʣ����ڽ��ʣ����ܾ����������ڴ���ó�׹�����";
		}else{
			Xs2="�������������͵ͷ����������㣬���ڵ�С�����㣬������˽Ӵ��в�ȡ����̬�ȣ������ڴ��¾�ϸ������������������ν���ף���Ҫȡ��������������²�ȡ����̬�ȡ��߷����������㣬���ʣ����ڽ��ʣ����ܾ����������ڴ���ó�׹����������м�״̬��";
		}
		return Xs2;
	}
	public String X3(){
		int X3;
		String Xs3 = "";
		X3= ((77+2*elementC+2*elementE+2*elementF+2*elementN)-(4*elementA+6*elementI+2*elementM))/10;
		if(X3<=3){
			Xs3="���������밲������ͣ����ǵͷ���������зḻ���е����Ų�������������ȱ�����ġ���ɥ�����ͣ��������е�ϸ�ڽ�Ϊ�������У��Ը��ºͣ�����������������ȡ�ж�ǰ����˼��������̫�ࡣ";
		}else if(X3>=8){
			Xs3="���������밲������ͣ����Ǹ߷�������������ҵ�ģ����ϣ����㣬�н�ȡ���񣬾������棬�ж�Ѹ�٣��������������ϵ�ϸ�ڣ�ֻ�����Ե�����ע�⣬��ʱ�ῼ�ǲ��ܣ����ƺ����ðȻ���¡�";
		}else{
			Xs3="���������밲������ͣ���зḻ���е����Ų�������������ȱ�����ġ���ɥ�����ͣ��������е�ϸ�ڽ�Ϊ�������У��Ը��ºͣ�����������������ȡ�ж�ǰ����˼��������̫�ࡣ�߷�������������ҵ�ģ����ϣ����㣬�н�ȡ���񣬾������棬�ж�Ѹ�٣��������������ϵ�ϸ�ڣ�ֻ�����Ե�����ע�⣬��ʱ�ῼ�ǲ��ܣ����ƺ����ðȻ���¡������м�״̬��";
		}
		
		return Xs3;
	}
	public String X4(){
		int X4;
		String Xs4 = "";
		X4= ((4*elementE+3*elementM+4*elementQ1+4*elementQ2)-(3*elementA+2*elementG))/10;
		if(X4<=3){
			Xs4="��ų������ͣ����ǵͷ������������ˣ����࣬���Ա�����������ʹ�����ܶ�������֧�����������ж��ϳ���Ӧ������Ϊ��ȡ���˵Ļ��Ļ�����Ǩ�͡�";
		}else if(X4>=8){
			Xs4="��ų������ͣ����Ǹ߷����������ϣ�������¶��â�������ǣ��й����Ե�����ͨ����������Ѱ�ҿ���ʩչ������Ϊ�Ļ�������ᣬ�Գ�ֱ����Լ��Ķ���������������ȡ�����档";
		}else{
			Xs4="��ų������͵ͷ������������ˣ����࣬���Ա�����������ʹ�����ܶ�������֧�����������ж��ϳ���Ӧ������Ϊ��ȡ���˵Ļ��Ļ�����Ǩ�͡��߷����������ϣ�������¶��â�������ǣ��й����Ե�����ͨ����������Ѱ�ҿ���ʩչ������Ϊ�Ļ�������ᣬ�Գ�ֱ����Լ��Ķ���������������ȡ�����档�����м�״̬��";
		}
		return Xs4;
	}
	public String Y1(){
		int y1 = elementC+elementF+(11-elementO)+(11-elementQ4);
		return "��������������Ϊ"+y1+"�֣�������״��������һ��ְҵ����ҵ�ɹ��Ļ��������������ߣ���ѧϰ�͹���Ч�ʶ�����֮���͡���������׼�ɽ���4-40֮�䣬��ֵΪ22�֡�����12���߽�ռ���������10%���������ȶ��ĳ̶���Ϊ������";
	}
	public String Y2(){
		int y2 = elementQ3*2+elementG*2+elementC*2+elementE+elementN+elementQ2+elementQ1;
		return "����רҵ�гɾ��ߵ��˸�����Ϊ"+y2+"�֣����μ�������ָ�˸��е�ĳЩ���ؿ��ܶԽ�����רҵ�ɾ������е�Ӱ�죬������������רҵ�ɾ����ﵽ��ˮƽ�����ֿܷɽ���10-100֮�䣬ƽ����Ϊ55��67��������ɹ��Ļ������";
	}
	public String Y3(){
		int y3=(11-elementA)*2+elementB*2+elementE+(11-elementF)*2+elementH+elementI*2+elementM+(11-elementN)+elementQ1+elementQ2*2;
		return "���Ĵ�����ǿ�ߵ��˸�����Ϊ"+y3+"�֣�����70�����ڴ�����ǿ�ߵķ�Χ��Ӧ����ɾ͡�";
	}
	public String Y4(){
		int y4 = elementB+elementG+elementQ3+(11-elementF);
		return "�������»������гɳ��������˸�����Ϊ"+y4+"�֣����μ������ֿܷɽ���4-40֮�䣬ƽ��ֵΪ22�֣�����17���߽�ռ������10%���ң�����רҵ��ѵ���ɹ��Ŀ����Խ�С��25�������ߣ����гɹ���ϣ����";
	}
}
