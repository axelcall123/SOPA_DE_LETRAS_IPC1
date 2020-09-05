package sopadeletras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SopaDeLetras {
    
    public static void main(String[] args) {
        Scanner TECLADO = new Scanner(System.in);//ENTRADAS
        EJECUCIONES ej= new EJECUCIONES();//EJECUCIONES
        
        ParaAlmacen datos[]= new ParaAlmacen[256];//OBJETO NOMBRE/PUNTOS
        Palabras al_word[] = new Palabras[256];//OBJETO PALABRAS
        ALEATORIOS ram[] = new ALEATORIOS[256];//OBJETO POSICION DE LOS PALABRAS
        boolean salir=false;//SALIR DEL MENU PRINCIPAL
        boolean salir_np=false;
        boolean salir_mp=false;
        int id_jugador=0;
        int opcion=0;//VARIABLE PARA EL BUCLE SWITCH PARA EL MENU
        int opcion_d=0;
       	int opcion_t=0;
        do{/////////////////////////////////////////////////////////MENU PRINCIPAL XD////////////////////////////////////////////////////////////////
	    System.out.println("///////MENU PRINCIPAL//////");
	    System.out.println("1. NUEVA PARTIDA");
            System.out.println("2. HISTORIAL");
            System.out.println("3. PUNTUACIONES");	        
            System.out.println("4. SALIR");
            System.out.println("ESCRIBE UNA OPCION");
            try{//ERROES
                opcion = TECLADO.nextInt();   
	    }catch(InputMismatchException e){
                System.out.println("INSERTAR UN NUMERO VALIDO");
                TECLADO.next();
            }
            //NO MUERA EL PROGRAMA
            switch (opcion) {////////////////////////////////////////////////////////////////////////MENU 1
                case 1:
                System.out.println("INGRESAR SU NOMBRE = "+(id_jugador+1));
                String nombre=TECLADO.next(); //TIENE QUE ESTAR EN EL MAIN PRINCIPAL SOLICITA NOMBRE  
                ej.Retener_Nombre(nombre); //VARIABLE NOMBRE RETIENE EL NOMBRE
                
                
                System.out.println("INGRESE EL TAMAÑO DEL TABLERO");//ALMACENANDO EL TAMÑAO DEL TABLERO
                int n=TECLADO.nextInt(); //VARIABLE N PARA EL TAMAÑO
                ej.Ingresar_Tablero(n);
           
                
                // ALMACENA EL TAMAÑO DEL TECLADO
                //INICIALIZANDO VARIABLES
                ej.Retener_puntos(25);
                ej.Retener_econtradas(0);
                ej.Retener_fails(0);
                 ej.Retener_numero_Palabra(0);
                datos[id_jugador]=new ParaAlmacen(ej.Regresar_Nombre(),ej.Regresar_puntos(),ej.Regresar_econtrados(),ej.Regresar_fails());// ALAMACENA EL NOMBRE EN EL ID
                for(int a=0;a<ej.Regresar_numero_Palabra();a++){//CONVETIR EN NULO TODAS LA PALBRAS OTRA VEZ
                    ej.Retener_Palabra(null);
                    al_word[a]=new Palabras(ej.Regresar_Palabra());
                }
                //System.out.println(ej.Regresar_Nombre());
                //System.out.println(ej.Regresar_Tablero());
                do{
                ////////////////////////////////////////////COMIENZO DEL MENU NUEVA PARTIDA /////////////////////////////////////    

                //System.out.println(PA.Regresar_Tablero());//CODIGO MUERTO
                System.out.println("******NUEVA PARTIDA******");
                System.out.println("1. MENU DE PALABRAS");
                System.out.println("2. JUGAR");
                System.out.println("3. SALIR A MENU");

                salir_np = false;
                System.out.println("ESCRIBE UNA OPCION");
                
                try{//ERROES
                    opcion_d = TECLADO.nextInt();///VARIABLE DE LA OPCION DEL MENU UNO
                }catch(InputMismatchException e){
                    System.out.println("INSERTAR UN NUMERO VALIDO");
                    TECLADO.next();
                }
                
                switch (opcion_d) {////////////////////////////////////////////////////////////////////////MENU 2
                    case 1:
                        System.out.println("INGRESANDO A MENU DE PALBRAS.................");
                        do{
                        /////////////////////////////////////////INSERTAR MODIFICA ELMINAR ////////////////////////////////////////
                        System.out.println("******MENU PALABRAS******");
                        System.out.println("1. INSERTAR");
                        System.out.println("2. VER PALABRAS");
                        System.out.println("3. MODIFICAR");
                        System.out.println("4. ELIMINAR");
                        System.out.println("5. SALIR A JUGAR");
                        System.out.println("ESCRIBE UNA OPCION");
                        salir_mp = false;
                        
                        try{//ERROES
                            opcion_t = TECLADO.nextInt();///VARIABLE DE LA OPCION DEL MENU
                        }catch(InputMismatchException e){
                            System.out.println("INSERTAR UN NUMERO VALIDO");
                            TECLADO.next();
                        }   
                        
                            switch (opcion_t) {////////////////////////////////////////////////////////////////////////MENU 3
                                
                                case 1://INSERTAR PALABRAS
                                    System.out.println("INGRESANDO A INSERTAR-------------");
                                    System.out.println("INGRESE EL NUMERO DE PALABRAS QUE QUIERE INSERTAR");
                                    
                                    
                                    
                                try{//ERROES
                                    int numero_palabra=TECLADO.nextInt();
                                    ej.Retener_numero_Palabra(numero_palabra);//ALAMACENANDO LA CANTIDAD DE PALABRAS
                                }catch(InputMismatchException e){
                                    System.out.println("INSERTAR UN NUMERO VALIDO");
                                    TECLADO.next();
                                }       

                                    for(int a=0;a<ej.Regresar_numero_Palabra();a++){//CONVETIR EN NULO TODAS LA PALBRAS OTRA VEZ
                                        ej.Retener_Palabra(null);
                                        al_word[a]=new Palabras(ej.Regresar_Palabra());
                                    }
                                    
                                    
                                    for(int a=0;a<ej.Regresar_numero_Palabra();a++){
                                        TECLADO.nextLine();
                                        System.out.println("INGRESAR LA PALABRA NUMERO "+(a+1));
                                        String palabra=TECLADO.next();//SOLICITAR PALABRAS
                                        if((palabra.length()>=4)&&(palabra.length()<=10)){//SI ES ENTRE 4 A 10
                                            ej.Retener_Palabra(palabra);//RETIENE LA PALABRA INGRESADA
                                            //DEVUELEVE LA PALABRA INGRESADA
                                            al_word[a]=new Palabras(ej.Regresar_Palabra());
                                        }else{
                                            System.out.println("INGRESE DE NUEVO SU PALABRA DEVE SER DE 4 A 10 DIDGITOS");//MOESTRAR ESTO
                                            a--;//DIMMINIUR A LA ANTERIRO PALABRA
                                            continue;//SALTAR ESE NUMERO
                                        }      
                                    } 
                                   break;
                                case 2:
                                    System.out.println("INGRESANDO A VER PALABRAS-------------");//VER PALABRAS ALMACENADAS
                                        System.out.print("|");
                                        for(int c=0;c<ej.Regresar_numero_Palabra();c++){//CICLO PARA BUSQUEDA DE PALABRA
                                          if(al_word[c].getword()==null){//SI ES NULA NO MUETRA NADA
                                              continue;
                                          }else{
                                            System.out.print(al_word[c].getword()+"|");//SI NO IMPRIMI ESTO
                                          }
                                        }
                                        System.out.println();


                                   break;
                                case 3:
                                    System.out.println("INGRESANDO A MODIFICAR-------------");
                                    if(ej.Regresar_numero_Palabra()==0){System.out.println("NO HA INGRESDO PALABRAS");}//CONDICION PARA VER SI HA INGRESADO PALABRAS
                                    else{
                                        System.out.println("ESCRIBE LA PALABRA QUE QUIERE MODIFICAR");
                                        TECLADO.nextLine();
                                        String buscar_palabra=TECLADO.nextLine();//CONDICION PARA VERIFICAR SI EXISTE PALABRA
                                        for(int a=0;a<ej.Regresar_numero_Palabra();a++){
                                            if(al_word[a].getword().equals(buscar_palabra)){//CICLO PARA BUSCAR LAS PALABRAS
                                                System.out.println("INSERTAR PALABRA PARA MODIFICAR LA PALABRA: "+al_word[a].getword());//MUESTRA LA PALBRA QUE SE QUIERE MODIFICAR
                                                String ingresar_palabra=TECLADO.nextLine();//INGRESAR LA PALBRA PARA MODIFICARLA
                                                al_word[a].setword(ingresar_palabra);//MODIFICANDO LA PALBRA
                                                System.out.println(al_word[a].getword()+" MODIFICADA");
                                            } 
                                        }
                                    }
                                    break;
                                case 4:
                                    if((ej.Regresar_numero_Palabra()==0)){System.out.println("NO HA INGRESDO PALABRAS");}//CONDICION PARA VER SI HA INGRSADO PALABRAS
                                    else{
                                        System.out.println("INGRESANDO A ELIMINAR");
                                        System.out.println("ESCRIBE LA PALABRA QUE QUIERE ELIMINAR");
                                        TECLADO.nextLine();
                                        String bus_palabra=TECLADO.nextLine();
                                        for(int a=0;a<ej.Regresar_numero_Palabra();a++){//CONDICION PARA VERIFICAR SI EXISTE PALABRA
                                            if(al_word[a].getword()==null){continue;}
                                            if(al_word[a].getword().equals(bus_palabra)){//CICLO PARA BUSCAR LAS PALABRAS
                                                System.out.println("ELIMINANDO PALABRA: "+al_word[a].getword());//MUESTRA LA PALBRA QUE SE QUIERE MODIFICAR
                                                al_word[a].setword(null);//ELIMNANDO DEJANDOLO COMO UNA LETRA Z 
                                            }
                                        }
                                    }
                                   break;
                                case 5:
                                    salir_mp = true;
                                    break;
                                default:
                                   System.out.println("SE DEBE INSERTAR NUMEROS DEL 1 AL 5");       
                           }
                    }while(!salir_mp);
                        break;
                    case 2:///////////////////////////////////////////////////////////////////
                        if((ej.Regresar_numero_Palabra()==0||al_word[0]==null)){
                                System.out.println("NO HAY PALABRA");//VERIFICAR SI HAY PLABRA ALMACENADA
                        }else{
                            System.out.println("INGRESANDO A JUGAR-------------");
                            TECLADO.nextLine();
                            char[][] Letras = new char[ej.Regresar_Tablero()][ej.Regresar_Tablero()];//MATRIZ DE N*N
                            char[][] comprobaciones = new char[ej.Regresar_Tablero()][ej.Regresar_Tablero()];
                            char comienzo='a';//EMPEZAR LA VARIABLE

                            for(int a=0;a<Letras.length;a++){//LLENAR MATRIZ DE LETRAS ALEATORIAS
                                for(int c=0;c<Letras.length;c++){
                                    int n_letra=(int)(Math.random()*26+0);
                                    Letras[a][c]=(char)+(comienzo+n_letra);
                                }
                                System.out.println();
                            }
                            for(int a=0;a<Letras.length;a++){//LLENAR MATRIZ DE LETRAS ALEATORIAS
                                for(int c=0;c<Letras.length;c++){
                                    comprobaciones[a][c]='$';
                                }
                                System.out.println();
                            }

                            for(int k=0;k<ej.Regresar_numero_Palabra();k++){//CICLO PARA ALMACENAR PALABRAS
                                if(al_word[k].getword()==null){continue;}//SI LA POSICION ES NULA CONTINUARLA
                                String words=al_word[k].getword();
                                char[] Caracteres=words.toCharArray();//CONVERTIR A UN CHAR CON POSICIONES
                                int aleatorio_u=(int)(Math.random()*(ej.Regresar_Tablero()-Caracteres.length)+0);//NUMEROS RANDOM
                                int aleatorio_d=(int)(Math.random()*(ej.Regresar_Tablero()-1)+0);//OTRO NUMERO RANDOM
                                ej.Retener_alea(aleatorio_u, aleatorio_d);//OBTENER LA POSICION ALEATORIA
                                //System.out.println(ej.Regresar_Tablero()+" TAMAÑO");
                                ram[k] = new ALEATORIOS(ej.Regresar_alea_u(),ej.Regresa_alea_d());//ALAMCENAR POSICIONES ALEATORIAS
                                
                                
                                int SiNo=(int) (Math.random()*(3)+0);
                                System.out.println(aleatorio_u+","+aleatorio_d+";"+SiNo);
                                int kk=Caracteres.length-1;
                                
                                int x=0;
                                int y=0;
                                
                                if(k%2==0){//SI ES PAR
                                    if((SiNo==0)||(SiNo==3)){//SI NO
                                        for(int a=0;a<Caracteres.length;a++){
                                            comprobaciones[aleatorio_d][aleatorio_u+a]='@';
                                            Letras[aleatorio_d][aleatorio_u+a]=Caracteres[a];
                                        }
                                    }else{
                                        for(int a=0;a<Caracteres.length;a++){//ALREVES
                                            comprobaciones[aleatorio_d][aleatorio_u+a]='@';
                                            Letras[aleatorio_d][aleatorio_u+a]=Caracteres[kk];
                                            kk--;//VARIABEL QUE HACE QUE DECRECA Y ESTE ALREVES LA PALABRA
                                        }
                                    }
                                }else{//NO ES PAR
                                    if((SiNo==1)||(SiNo==2)){//SI NO
                                         for(int a=0;a<Caracteres.length;a++){//SI NO ES PAR
                                            if(comprobaciones[aleatorio_u+a][aleatorio_d]=='@'){
                                               System.out.println("NO"); 
                                            }   
                                            comprobaciones[aleatorio_u+a][aleatorio_d]='@';
                                            Letras[aleatorio_u+a][aleatorio_d]=Caracteres[a];
                                        }
                                    }else{
                                        for(int a=0;a<Caracteres.length;a++){//ALREVES
                                            if(comprobaciones[aleatorio_u+a][aleatorio_d]=='@'){
                                                System.out.println("NO"); 
                                            }  
                                            comprobaciones[aleatorio_u+a][aleatorio_d]='@';
                                            Letras[aleatorio_u+a][aleatorio_d]=Caracteres[a];
                                            kk--;//VARIABEL QUE HACE QUE DECRECA Y ESTE ALREVES LA PALABRA
                                        }
                                    }

                                }
                            }
                            for(int a=0;a<Letras.length;a++){//IMPRIMIR MATRIZ RESTANTE CON PALABRAS
                                for(int b=0;b<Letras.length;b++){
                                    System.out.print("|"+comprobaciones[a][b]+"|");
                                }
                                System.out.println();
                            }
                            
                            for(int a=0;a<Letras.length;a++){//IMPRIMIR MATRIZ RESTANTE CON PALABRAS
                                for(int b=0;b<Letras.length;b++){
                                    System.out.print("|"+Letras[a][b]+"|");
                                }
                                System.out.println();
                            }
                            int k=0;
                            int numero_P=0;//CONTAR PALABRAS ACERTADAS
                            for(int x=0;x+k<=4;x++){
                                /////PARA SUSTITUIR POR ##
                                //SI ES NULA SALTARLO
                                 System.out.println("INGRESE LA PALABRA ENCONTRADA");
                                if(x<4){String jugar_palabra=TECLADO.nextLine();//CONDICION PARA SOLO 4 INTENTOS
                                    for(int a=0;a<ej.Regresar_numero_Palabra();a++){//CICLO PARA BUSCAR LAS PALABRAS
                                        if(al_word[a].getword()==null){continue;}
                                        if(al_word[a].getword().equals(jugar_palabra)){
                                            System.out.println("PALABRA ENCONTRADA");
                                            String convertir= al_word[a].getword();//CONVERTIR LA PALABRA EN STRING
                                            if(Letras[ram[a].getOne()][ram[a].getTwo()]=='#'){
                                                System.out.println("PALABRA YA ECONTRADA ANTERIORMENTE");
                                            }
                                            if(a%2==0){//ID PAR DE LA PALABRA
                                                for(int y=0;y<convertir.length();y++){
                                                    Letras[ram[a].getTwo()][ram[a].getOne()+y]='#';
                                                    int puntos=al_word[a].getword().length();
                                                    
                                                }
                                                int puntos=al_word[a].getword().length();
                                                ej.Retener_puntos(puntos+ej.Regresar_puntos());//SUMAR PUNTOS
                                                datos[id_jugador].setPoint(ej.Regresar_puntos());//GUARDARLOS
                                                ej.Retener_econtradas(1+ej.Regresar_econtrados());//SUMAR 0+ ENCONTRADOS 1,
                                                
                                            }else{//ID IMPAR DE LA PALABRA
                                                for(int y=0;y<convertir.length();y++){
                                                Letras[ram[a].getOne()+y][ram[a].getTwo()]='#';
                                                }
                                                int puntos=al_word[a].getword().length();
                                                ej.Retener_puntos(puntos+ej.Regresar_puntos());//SUMAR PUNTOS
                                                datos[id_jugador].setPoint(ej.Regresar_puntos());//GUARDARLOS
                                                ej.Retener_econtradas(1+ej.Regresar_econtrados());//SUMAR 0+ ENCONTRADOS 1,
                                            } 
                                        numero_P++;//AUMENTAR PALBRAS ENCONTRADAS
                                        x--;//SIN NO SE CONFUNDE VOLVER A INGRESAR PALABRA DISMINUIR EL CICLO
                                        //continue;
                                        if(numero_P==ej.Regresar_numero_Palabra()){
                                        x++;
                                        }
                                        }  
                                    }
                                    for(int a=0;a<Letras.length;a++){//IMPRIMIR MATRIZ PORS SEGUNDA VEZ PARA SUSTITUIR
                                        for(int b=0;b<Letras.length;b++){
                                            System.out.print("|"+Letras[a][b]+"|");
                                        }
                                        System.out.println();
                                    }
                                }
                                
                                if((numero_P==ej.Regresar_numero_Palabra())||(x==4)){//PARA DEVOLVER LOS ERRORES
                                    int puntos=-x*5;
                                    ej.Retener_puntos(puntos+ej.Regresar_puntos());//RESTAR PUTNOS DE 5*FAIL+PUNTOS
                                    //System.out.println(puntos+" "+ej.Regresar_puntos()+" "+x+" jeje");
                                    datos[id_jugador].setPoint(ej.Regresar_puntos()); 
                                    k=99;
                                } //PARA TERMINAR EL CICLO CUANDO LLEGUE EL NUMERO DE PALBRAS INGRESADAS
                            }
                            
                            /*for(int a=0;a<ej.Regresar_numero_Palabra();a++){//CILCO PARA BUSCAR PALABRA
                                if(al_word[a].getword()==null){continue;}//SI ES NULA SALTARLA
                                int puntos=al_word[a].getword().length();//PUNTOS DEPENDIENDO TAMAÑO DE LA PALABRA
                                if((Letras[ram[a].getOne()][ram[a].getTwo()]=='#')&&(a%2==1)){//COMPARAR ASTERISCOS
                                    ej.Retener_puntos(puntos+ej.Regresar_puntos());//SUMAR PUNTOS
                                    datos[id_jugador].setPoint(ej.Regresar_puntos());//GUARDARLOS
                                    ej.Retener_econtradas(1+ej.Regresar_econtrados());//SUMAR 0+ ENCONTRADOS 1,2,3
                                    datos[id_jugador].setFind(ej.Regresar_econtrados());//DAR SELO AL JUGADOR    
                                }else if((Letras[ram[a].getTwo()][ram[a].getOne()]=='#')&&(a%2==0)){
                                    ej.Retener_puntos(puntos+ej.Regresar_puntos());//SUMAR PUNTOS
                                    datos[id_jugador].setPoint(ej.Regresar_puntos());//GUARDARLOS
                                    ej.Retener_econtradas(1+ej.Regresar_econtrados());//SUMAR 0+ ENCONTRADOS 1,2,3
                                    datos[id_jugador].setFind(ej.Regresar_econtrados());//DAR SELO AL JUGADOR
                                }
                                else{
                                    ej.Retener_fails(1+ej.Regresar_fails());
                                    datos[id_jugador].setFails(ej.Regresar_fails());
                                }  
                            }*/
                            /*if(ej.Regresar_numero_Palabra()>4){//NUEMRO DE PALBRAS MAYORES A 4
                                if(ej.Regresar_fails()>4){//SE CONFUNDIO MAS DE 4 HAZ ESTO
                                    ej.Retener_puntos(-20+ej.Regresar_puntos());
                                    datos[id_jugador].setPoint(ej.Regresar_puntos());
                                }else{//SE CONFUNDIO MENOS DE 4 FAIL*5 + PUNTOS
                                    ej.Retener_puntos(-ej.Regresar_fails()*5+ej.Regresar_puntos());//RESTAR PUTNOS DE 5*FAIL+PUNTOS
                                    datos[id_jugador].setPoint(ej.Regresar_puntos());
                                }
                            }else{
                                ej.Retener_puntos(-ej.Regresar_fails()*5+ej.Regresar_puntos());//RESTAR PUTNOS DE 5*FAIL+PUNTOS
                                datos[id_jugador].setPoint(ej.Regresar_puntos());
                            }*/
                        /*for(int a=0;a<ej.Regresar_numero_Palabra();a++){//SALIR DEL MENU
                            ej.Retener_Palabra(null);
                            al_word[a]=new Palabras(ej.Regresar_Palabra());
                        }*/

                        salir_np = true;//salir menu principal
                        //salir_mp = true;
                    }
                    System.out.println(datos[id_jugador].getName()+"|PUNTOS "+datos[id_jugador].getPoint()+" PALABRAS ECONTRADAS= "+datos[id_jugador].getFind()+" PALABRAS NO ENCONTRADAS= "+datos[id_jugador].getFails());
                        break;
                    case 3:
                        salir_np = true;
                        break; 
                    case 616:
                        System.out.println("-------------------------DEPURACIONuno-----------------------------");
                        System.out.println(datos[0].getName()+" OTRO NOMBRE "+datos[1].getName());
                        break;
                    default:
                        System.out.println("SE DEBE INSERTAR NUMEROS DEL 1 AL 3");
                        
                    }

                }while(!salir_np);

                    break; 
                case 2:
                    System.out.println("AXEL ELI CALDERON BARRIENTOS 201901458");
                    if(datos[0]==null){
                        System.out.println(".........."); id_jugador--;  break;  
                    }else{
                        
                        System.out.println("INGRESANDO A HISTORIAL-------------");
                        System.out.println("TOP 3 JUGADORES");
                        int mayor=0;
                        System.out.print("|");
                        for(int a=0;a<id_jugador;a++){
                            int nota=datos[a].getPoint();
                                if(nota>mayor){
                                    mayor=nota;
                                    System.out.println(datos[a].getName()+" |puntos "+datos[a].getPoint());
                            }
                        }
                        
                        System.out.println("JUGADORES QUE NO ECONTRARON NINGUNA PALABRA");
                        for(int a=0;a<id_jugador;a++){
                            if(datos[a].getFails()==ej.Regresar_numero_Palabra()){//SI LOS FAILS SON CERO
                                System.out.print("|"+datos[a].getName()+"|");
                            }
                        System.out.println("JUGADORES QUE NO ECONTRARON NINGUNA PALABRA");
                            if(datos[a].getFind()==ej.Regresar_numero_Palabra()){
                                System.out.print("|"+datos[a].getName()+"|");
                            }
                        }
                    }
                    System.out.println();
                    id_jugador--;  
                    break;
                case 3:
                    System.out.println("AXEL ELI CALDERON BARRIENTOS 201901458");
                    System.out.println("INGRESANDO A PUNTUACIONES-------------");
  
                    System.out.println("AXEL ELI CALDERON BARRIENTOS| 201901458");
                    if(datos[0]==null){//SI NO HAY JUGADORES
                        System.out.println(".........."); id_jugador--;  break;  
                    }else{//SI HAY
                        System.out.println("HISTORIAL TOTAL DE JUGADORES");
                        for(int a=0;a<id_jugador;a++){
                            System.out.println(datos[a].getName()+"|PUNTOS "+datos[a].getPoint()+" PALABRAS ECONTRADAS= "+datos[a].getFind()+" PALABRAS NO ENCONTRADAS= "+datos[a].getFails());//LLENAR EL HISTORIAL
                        }
                        for(int a=id_jugador;a<3;a++){//LLENAR DE RANDOMS
                            int puntos=(int)(Math.random()*(50)+0);
                            int econtradas=(int)(Math.random()*(10)+0);
                            int fails=(int)(Math.random()*(10)+0);
                            String nombres[]={"JORGE","DAVID","PAMELA","CRUZ","USAC","GALVEZ","MARROQUIN","LANDIVAR"};
                            int names=(int)(Math.random()*(7)+0);
                            System.out.println(nombres[names]+"|PUNTOS "+puntos+" PALABRAS ECONTRADAS= "+econtradas+" PALABRAS NO ENCONTRADAS= "+fails);
                        }
                    }
                    id_jugador--; 
                    break;
                case 4:
                    System.out.println("SALIENDO.................");
                    salir = true;
                    break;
                case 616:
                    System.out.println("-------------------------DEPURACIONdos-----------------------------");
                    
                    id_jugador--; 
                    break;
                default:
                    System.out.println("SE DEBE INSERTAR NUMEROS DEL 1 AL 4");
                    id_jugador--;//SI NO INGRESA LO ADECUADO ENTONCES ID ANTERIOR
            }
            id_jugador++;
    }while(!salir);
    /*for(int c=0;c<1;c++){
        int jk[]={161,11,23,27,25,45,67,12,45,100};
            int mayor=0;
            for(int a=0;a<10;a++){
                    int nota=jk[a];
                if(nota>mayor){
                    if(a==0){
                        continue;
                    }
                    mayor=nota;
                    System.out.println(mayor+" "+a);
                }
                //mayor=mayor-999999999;
        //System.out.println(mayor+" x");
        }
         
  } */}

}
   
