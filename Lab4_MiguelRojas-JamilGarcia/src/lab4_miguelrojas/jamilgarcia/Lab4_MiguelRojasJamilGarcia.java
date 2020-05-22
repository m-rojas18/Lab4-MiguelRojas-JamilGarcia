package lab4_miguelrojas.jamilgarcia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab4_MiguelRojasJamilGarcia {

    static ArrayList<String> lista_usuarios = new ArrayList();
    static ArrayList<Ingenieros> lista_ingenieros = new ArrayList();
    static ArrayList<Medios_Transporte> lista_medioTrans = new ArrayList();
    static int posicion_ing = 0;

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        //Prueba
        lista_usuarios.add("mrojas");
        Ingenieros ing0 = new Ingenieros("tgrew", "hola", "hola", new Date(), "Miguel", "A", "Masculino", 1.80, 190);
        lista_ingenieros.add(ing0);

        char resp = 's';
        while (resp == 's') {
            System.out.print("-----Menu Laboratorio 4-----\n"
                    + "[1] Registro\n"
                    + "[2] Iniciar Sesion\n"
                    + "[3] Salir\n"
                    + "Seleccione una opcion: ");
            int opcion = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println();
            switch (opcion) {
                case 1:
                    //Registro de Ingenieros
                    //Instanciar Objeto
                    Ingenieros ing = new Ingenieros();
                    System.out.print("----------------\n"
                            + "Registro de Ingenieros\n\n"
                            + "Ingrese su nombre: ");
                    //Nombre Ingeniero
                    String nombre_ingeniero = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println();
                    //Grupo Sanguineo
                    System.out.print("Grupos Sanguineos\n"
                            + "[1] A\n"
                            + "[2] B\n"
                            + "[3] AB\n"
                            + "[4] O\n"
                            + "Seleccione un grupo sanguineo: ");
                    int op_gs = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println();
                    String grupo_sanguineo = "";
                    if (op_gs == 1) {
                        grupo_sanguineo = "A";
                    }
                    if (op_gs == 2) {
                        grupo_sanguineo = "B";
                    }
                    if (op_gs == 3) {
                        grupo_sanguineo = "AB";
                    }
                    if (op_gs == 4) {
                        grupo_sanguineo = "O";
                    }
                    //Sexo
                    System.out.print("Sexo\n"
                            + "[1] Masculino\n"
                            + "[2] Femenino\n"
                            + "Seleccione su sexo: ");
                    int op_sexo = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println();
                    String sexo_ing = "";
                    if (op_sexo == 1) {
                        sexo_ing = "Masculino";
                    }

                    if (op_sexo == 1) {
                        sexo_ing = "Femenino";
                    }
                    //Altura
                    System.out.print("Ingrese su altura: ");
                    double altura_ing = sc.nextDouble();
                    sc = new Scanner(System.in);
                    System.out.println();
                    //Peso
                    System.out.print("Ingrese su peso: ");
                    int peso_ing = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println();
                    //Correo
                    System.out.print("Ingrese su correo: ");
                    String correo_ing = sc.nextLine();
                    System.out.println();
                    //Usuario
                    String usuario_ing = "";
                    boolean flag_usuario = true;
                    while (flag_usuario) {
                        //Verificar que sea unico
                        System.out.print("Ingrese su nombre de usuario: ");
                        usuario_ing = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println();

                        boolean buscar_user = false;
                        //Verificar Usuario
                        for (int i = 0; i < lista_usuarios.size(); i++) {
                            if (lista_usuarios.contains(usuario_ing)) {
                                buscar_user = true;
                            } else {
                                buscar_user = false;
                            }
                        }

                        if (buscar_user == true) {
                            System.out.print("Ese nombre de usuario ya existe.\n");
                        } else {
                            //No encontro al usuario repetido
                            flag_usuario = false;
                        }
                    }

                    //Idiomas
                    boolean flag_idiomas = true;
                    while (flag_idiomas) {
                        System.out.println("Idiomas\n"
                                + "[1] Ingles\n"
                                + "[2] Español\n"
                                + "[3] Aleman\n"
                                + "[4] Japones\n"
                                + "[5] Italiano\n"
                                + "Seleccione un idioma: ");
                        int op_idioma = sc.nextInt();
                        sc = new Scanner(System.in);
                        System.out.println();
                        if (op_idioma == 1) {
                            //Buscar si el idioma ya esta en la lista de idiomas
                            boolean add_idioma = false;
                            for (int i = 0; i < ing.getI_Idiomas().size(); i++) {
                                if (ing.getI_Idiomas().contains("Ingles")) {
                                    add_idioma = true;
                                } else {
                                    add_idioma = false;
                                }
                            }

                            if (add_idioma == true) {
                                System.out.println("Ya tiene agregado el idioma.\n");
                            } else {
                                //Agregar el idioma
                                ing.getI_Idiomas().add("Ingles");
                                System.out.println("Idioma agregado exitosamente!!\n");
                            }
                        }
                        if (op_idioma == 2) {
                            //Buscar si el idioma ya esta en la lista de idiomas
                            boolean add_idioma2 = false;
                            for (int i = 0; i < ing.getI_Idiomas().size(); i++) {
                                if (ing.getI_Idiomas().contains("Espanol")) {
                                    add_idioma2 = true;
                                } else {
                                    add_idioma2 = false;
                                }
                            }

                            if (add_idioma2 == true) {
                                System.out.println("Ya tiene agregado el idioma.\n");
                            } else {
                                //Agregar el idioma
                                ing.getI_Idiomas().add("Espanol");
                                System.out.println("Idioma agregado exitosamente!!\n");
                            }
                        }
                        if (op_idioma == 3) {
                            //Buscar si el idioma ya esta en la lista de idiomas
                            boolean add_idioma3 = false;
                            for (int i = 0; i < ing.getI_Idiomas().size(); i++) {
                                if (ing.getI_Idiomas().contains("Aleman")) {
                                    add_idioma3 = true;
                                } else {
                                    add_idioma3 = false;
                                }
                            }

                            if (add_idioma3 == true) {
                                System.out.println("Ya tiene agregado el idioma.\n");
                            } else {
                                //Agregar el idioma
                                ing.getI_Idiomas().add("Aleman");
                                System.out.println("Idioma agregado exitosamente!!\n");
                            }
                        }
                        if (op_idioma == 4) {
                            //Buscar si el idioma ya esta en la lista de idiomas
                            boolean add_idioma4 = false;
                            for (int i = 0; i < ing.getI_Idiomas().size(); i++) {
                                if (ing.getI_Idiomas().contains("Japones")) {
                                    add_idioma4 = true;
                                } else {
                                    add_idioma4 = false;
                                }
                            }

                            if (add_idioma4 == true) {
                                System.out.println("Ya tiene agregado el idioma.\n");
                            } else {
                                //Agregar el idioma
                                ing.getI_Idiomas().add("Japones");
                                System.out.println("Idioma agregado exitosamente!!\n");
                            }
                        }
                        if (op_idioma == 5) {
                            //Buscar si el idioma ya esta en la lista de idiomas
                            boolean add_idioma5 = false;
                            for (int i = 0; i < ing.getI_Idiomas().size(); i++) {
                                if (ing.getI_Idiomas().contains("Italiano")) {
                                    add_idioma5 = true;
                                } else {
                                    add_idioma5 = false;
                                }
                            }

                            if (add_idioma5 == true) {
                                System.out.println("Ya tiene agregado el idioma.\n");
                            } else {
                                //Agregar el idioma
                                ing.getI_Idiomas().add("Italiano");
                                System.out.println("Idioma agregado exitosamente!!\n");
                            }
                        }

                        System.out.print("Desea agregar otro idioma?\n"
                                + "[1] Si\n"
                                + "[2] No\n"
                                + "Eliga una opcion: ");
                        int op_seguir = sc.nextInt();
                        sc = new Scanner(System.in);
                        System.out.println();

                        if (op_seguir == 1) {
                            //do nothing
                        } else {
                            System.out.println();
                            flag_idiomas = false;
                        }
                    }

                    //Contraseña
                    System.out.print("Ingrese una contraseña: ");
                    String password_ing = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println();
                    //Fecha de nacimiento
                    System.out.print("Ingrese su fecha de nacimiento(dd/mm/yyyy) : ");
                    String fecha_nac = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println();

                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

                    //Agregar el Objeto Ingeniero
                    ing.setS_Nombre(nombre_ingeniero);
                    ing.setS_GSang(grupo_sanguineo);
                    ing.setS_Sexo(sexo_ing);
                    ing.setS_Altura(altura_ing);
                    ing.setS_Peso(peso_ing);
                    ing.setI_Correo(correo_ing);
                    ing.setI_Usuario(usuario_ing);
                    ing.setI_Pass(password_ing);
                    ing.setI_Fecha(sd.parse(fecha_nac));
                    //Agregar a lista de Ingenieros   
                    //Agregar a lista de Ingenieros
                    lista_ingenieros.add(ing);
                    System.out.println("Se registro exitosamente!!\n");
                    break;
                case 2:
                    //Menu de Ingenieros - Todo
                    System.out.print("----------------\n"
                            + "Iniciar Sesion\n\n"
                            + "Ingrese su usuario: ");
                    String usuario_ingresado = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println();
                    //Verificar el usuario
                    boolean buscar_usuario = true;
                    for (int i = 0; i < lista_ingenieros.size(); i++) {
                        if (lista_ingenieros.get(i).getI_Usuario().equals(usuario_ingresado)) {
                            posicion_ing = i;
                            buscar_usuario = false;
                        } else {
                            buscar_usuario = true;
                        }
                    }

                    if (buscar_usuario == false) {
                        //Encontro el usuario
                        System.out.print("Ingrese su contraseña: ");
                        String password_ingresada = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println();
                        if (lista_ingenieros.get(posicion_ing).getI_Pass().equals(password_ingresada)) {
                            //Contraseña correcta
                            //Menu Todo

                            boolean flag_menuP = true;
                            while (flag_menuP) {
                                System.out.print("Bienvenido\n\n"
                                        + "Menu Ingenieros\n"
                                        + "[1] Menu Seres Vivos\n"
                                        + "[2] Menu Medios Transporte\n"
                                        + "[3] Viajar\n"
                                        + "[4] Salir\n"
                                        + "Seleccione una opcion: ");
                                int op_menu = sc.nextInt();
                                sc = new Scanner(System.in);
                                System.out.println();
                                switch (op_menu) {
                                    case 1:
                                        System.out.print("------------------\n"
                                                + "-----Menu Seres Vivos-----\n\n"
                                                + "[1] Menu Primates\n"
                                                + "[2] Menu Gorilas\n"
                                                + "[3] Salir\n"
                                                + "Seleccione una opcion: ");
                                        break;
                                    case 2:
                                        //Menu medios transporte
                                        char flag_menuMT = 's';
                                        while (flag_menuMT == 's') {
                                            System.out.print("------------------\n"
                                                    + "----- Menu Medios Transporte-----\n"
                                                    + "[1] Menu Helicopteros\n"
                                                    + "[2] Menu Avion Comerciales\n"
                                                    + "[3] Menu Naves Espaciales\n"
                                                    + "[4] Menu Cohetes\n"
                                                    + "[5] Salir\n"
                                                    + "Seleccione una opcion: ");
                                            int opcion_menuMT = sc.nextInt();

                                            switch (opcion_menuMT) {
                                                case 1: //Menu Heli
                                                    System.out.println("------------------\n"
                                                            + "----- Menu Helicoptero-----\n"
                                                            + "[1] Crear Un Helicoptero \n"
                                                            + "[2] Modificar Un Helicoptero \n"
                                                            + "[3] Eliminar Un Helicoptero \n"
                                                            + "[4] Listar Un Helicoptero \n"
                                                            + "Seleccione una opcion: ");
                                                    int opcion_menuH = sc.nextInt();

                                                    switch (opcion_menuH) {
                                                        case 1: //Crear Heli
                                                            
                                                            System.out.println("Ingrese la cantidad de combustible en el tanque (1- 100): ");
                                                            int cantidad_combustible = sc.nextInt();

                                                            while (cantidad_combustible < 1 || cantidad_combustible > 100) {
                                                                System.out.println("Error! Vuelva a ingresarlo: ");
                                                                cantidad_combustible = sc.nextInt();
                                                            }

                                                            System.out.println("Ingrese la distancia capaz de recorrer: ");
                                                            int distancia = sc.nextInt();

                                                            System.out.println("Ingrese la altitud: (double)");
                                                            double altitud = sc.nextInt();

                                                            System.out.println("Ingrese el tipo de combustible: \n"
                                                                    + "[1] Super\n "
                                                                    + "[2] Regular\n "
                                                                    + "[3] Diesel\n ");
                                                            int opcion_menuComb = sc.nextInt(); 
                                                             
                                                            String combustible = "";
                                                            switch (opcion_menuComb) {
                                                                case 1:
                                                                    combustible = "Super"; 
                                                                    break;
                                                                case 2:
                                                                    combustible = "Regular"; 
                                                                    break;
                                                                case 3:
                                                                    combustible = "Diesel"; 
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un valor valido!!");
                                                            }
                                                            
                                                            System.out.println("Escriba el pais de partida: ");
                                                            String PaisP = sc.next(); 
                                                            
                                                            System.out.println("Escriba el pais de llegada: ");
                                                            String PaisL = sc.next(); 
                                                            
                                                            System.out.println("Ingrese el numero de helices del Helicoptero: ");
                                                            int n_helices = sc.nextInt(); 
                                                            
                                                            System.out.println("Ingrese el numero de patas del Helicoptero: ");
                                                            int n_patas = sc.nextInt(); 
                                                            
                                                            lista_medioTrans.add(new Helicoptero(n_helices, n_patas, combustible, PaisP, PaisL, cantidad_combustible, distancia, altitud));
                                                            
                                                            break;
                                                        case 2: //Modificar Heli

                                                            break;
                                                        case 3: //Eliminar Heli

                                                            break;
                                                        case 4: //Listar Heli

                                                            break;
                                                        default:
                                                            System.out.println("Error!Ingrese una opcion Valida!!");
                                                    }

                                                    break;
                                                case 2: //Menu Avion
                                                    System.out.println("------------------\n"
                                                            + "----- Menu Avion-----\n"
                                                            + "[1] Crear Un Avion \n"
                                                            + "[2] Modificar Un Avion \n"
                                                            + "[3] Eliminar Un Avion \n"
                                                            + "[4] Listar Un Avion \n"
                                                            + "Seleccione una opcion: ");
                                                    int opcion_menuA = sc.nextInt();

                                                    switch (opcion_menuA) {
                                                        case 1: //Crear Avion
                                                            
                                                            System.out.println("Ingrese la cantidad de combustible en el tanque (1- 100): ");
                                                            int cantidad_combustible = sc.nextInt();

                                                            while (cantidad_combustible < 1 || cantidad_combustible > 100) {
                                                                System.out.println("Error! Vuelva a ingresarlo: ");
                                                                cantidad_combustible = sc.nextInt();
                                                            }

                                                            System.out.println("Ingrese la distancia capaz de recorrer: ");
                                                            int distancia = sc.nextInt();

                                                            System.out.println("Ingrese la altitud: (double)");
                                                            double altitud = sc.nextInt();
                                                            
                                                            System.out.println("Ingrese el tipo de combustible: \n"
                                                                    + "[1] Super\n "
                                                                    + "[2] Regular\n "
                                                                    + "[3] Diesel\n ");
                                                            int opcion_menuComb = sc.nextInt(); 
                                                             
                                                            String combustible = "";
                                                            switch (opcion_menuComb) {
                                                                case 1:
                                                                    combustible = "Super"; 
                                                                    break;
                                                                case 2:
                                                                    combustible = "Regular"; 
                                                                    break;
                                                                case 3:
                                                                    combustible = "Diesel"; 
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un valor valido!!");
                                                            }
                                                            
                                                            System.out.println("Escriba el pais de partida: ");
                                                            String PaisP = sc.next(); 
                                                            
                                                            System.out.println("Escriba el pais de llegada: ");
                                                            String PaisL = sc.next(); 
                                                            
                                                            System.out.println("Ingrese el numero de pasajeros: ");
                                                            int n_pasajeros = sc.nextInt(); 
                                                            
                                                            System.out.println("Funciona el piloto automatico?\n"
                                                                    + "[1] Si \n"
                                                                    + "[2] No\n");
                                                            int opcion_Pilot = sc.nextInt(); 
                                                            String Pilot =""; 
                                                            switch (opcion_Pilot) {
                                                                case 1:
                                                                    Pilot = "Si"; 
                                                                    break;
                                                                case 2:
                                                                    Pilot = "No"; 
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese opcion validad");
                                                            }
                                                            
                                                            lista_medioTrans.add(new Avion_Comercial(n_pasajeros, Pilot, combustible, PaisP, PaisL, cantidad_combustible, distancia, altitud));
                                                            
                                                            break;
                                                        case 2: //Modificar Avion

                                                            break;
                                                        case 3: //Eliminar Avion

                                                            break;
                                                        case 4: //Listar Avion

                                                            break;
                                                        default:
                                                            System.out.println("Error!Ingrese una opcion Valida!!");
                                                    }

                                                    break;

                                                case 3: //Menu Naves

                                                    System.out.println("------------------\n"
                                                            + "----- Menu Naves-----\n"
                                                            + "[1] Crear Una Nave \n"
                                                            + "[2] Modificar Una Nave \n"
                                                            + "[3] Eliminar Una Nave \n"
                                                            + "[4] Listar Una Nave \n"
                                                            + "Seleccione una opcion: ");
                                                    int opcion_menuN = sc.nextInt();

                                                    switch (opcion_menuN) {
                                                        case 1: //Crear Naves
                                                            
                                                            System.out.println("Ingrese la cantidad de combustible en el tanque (1- 100): ");
                                                            int cantidad_combustible = sc.nextInt();

                                                            while (cantidad_combustible < 1 || cantidad_combustible > 100) {
                                                                System.out.println("Error! Vuelva a ingresarlo: ");
                                                                cantidad_combustible = sc.nextInt();
                                                            }

                                                            System.out.println("Ingrese la distancia capaz de recorrer: ");
                                                            int distancia = sc.nextInt();

                                                            System.out.println("Ingrese la altitud: ");
                                                            int altitud = sc.nextInt();
                                                            
                                                             System.out.println("Ingrese el tipo de combustible: \n"
                                                                    + "[1] Quimico Solido\n "
                                                                    + "[2] Propelente Liquido\n");
                                                            int opcion_menuComb = sc.nextInt(); 
                                                             
                                                            String combustible;
                                                            switch (opcion_menuComb) {
                                                                case 1:
                                                                    combustible = "Quimico Solido"; 
                                                                    break;
                                                                case 2:
                                                                    combustible = "Propelente Liquido"; 
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un valor valido!!");
                                                            }
                                                            
                                                            System.out.println("Escriba el Planeta de partida: ");
                                                            String PlanetaP = sc.next(); 
                                                            
                                                            System.out.println("Escriba el Planeta de llegada: ");
                                                            String PlanetaL = sc.next(); 

                                                            System.out.println("Ingrese el numero de propulsores:");
                                                            int Propulsores = sc.nextInt();
                                                            
                                                            
                                                            
                                                            break;
                                                        case 2: //Modificar Naves

                                                            break;
                                                        case 3: //Eliminar Naves

                                                            break;
                                                        case 4: //Listar Naves

                                                            break;
                                                        default:
                                                            System.out.println("Error!Ingrese una opcion Valida!!");
                                                    }
                                                    break;
                                                case 4: //Menu Cohete

                                                    System.out.println("------------------\n"
                                                            + "----- Menu Cohete-----\n"
                                                            + "[1] Crear Un Cohete \n"
                                                            + "[2] Modificar Un Cohete \n"
                                                            + "[3] Eliminar Un Cohete \n"
                                                            + "[4] Listar Un Cohete \n"
                                                            + "Seleccione una opcion: ");
                                                    int opcion_menuC = sc.nextInt();

                                                    switch (opcion_menuC) {
                                                        case 1: //Crear Cohete
                                                            
                                                            System.out.println("Ingrese la cantidad de combustible en el tanque (1- 100): ");
                                                            int cantidad_combustible = sc.nextInt();

                                                            while (cantidad_combustible < 1 || cantidad_combustible > 100) {
                                                                System.out.println("Error! Vuelva a ingresarlo: ");
                                                                cantidad_combustible = sc.nextInt();
                                                            }

                                                            System.out.println("Ingrese la distancia capaz de recorrer: ");
                                                            int distancia = sc.nextInt();

                                                            System.out.println("Ingrese la altitud: ");
                                                            int altitud = sc.nextInt();
                                                            
                                                             System.out.println("Ingrese el tipo de combustible: \n"
                                                                    + "[1] Quimico Solido\n "
                                                                    + "[2] Propelente Liquido\n");
                                                            int opcion_menuComb = sc.nextInt(); 
                                                             
                                                            String combustible;
                                                            switch (opcion_menuComb) {
                                                                case 1:
                                                                    combustible = "Quimico Solido"; 
                                                                    break;
                                                                case 2:
                                                                    combustible = "Propelente Liquido"; 
                                                                    break;
                                                                default:
                                                                    System.out.println("Ingrese un valor valido!!");
                                                            }
                                                            
                                                            System.out.println("Escriba el Planeta de partida: ");
                                                            String PlanetaP = sc.next(); 
                                                            
                                                            System.out.println("Escriba el Planeta de llegada: ");
                                                            String PlanetaL = sc.next(); 
                                                            
                                                            System.out.println("Ingrese el numero de separaciones: ");
                                                            int separaciones = sc.nextInt();

                                                            break;
                                                        case 2: //Modificar Cohete

                                                            break;
                                                        case 3: //Eliminar Cohete

                                                            break;
                                                        case 4: //Listar Cohete

                                                            break;
                                                        default:
                                                            System.out.println("Error!Ingrese una opcion Valida!!");
                                                    }

                                                    break;
                                                case 5: //Menu Salir

                                                    break;
                                                default:
                                                    System.out.println("Ingrese un numero valido!!!");
                                            }
                                        }
                                        break;
                                    case 3:
                                        //Opcion viajar
                                        System.out.print("-----------------\n"
                                                + "Viajar");
                                        break;
                                    case 4:
                                        //Salir de menu
                                        System.out.println("Adios!!\n");
                                        flag_menuP = false;
                                        break;
                                    default:
                                        System.out.println("Ingrese una opcion valida.\n");
                                }
                            }

                        } else {
                            System.out.println("La contraseña es incorrecta.\n");
                        }

                    } else {
                        //No encontro el usuario
                        System.out.println("El usuario ingresado no existe o es incorrecto.\n");
                    }
                case 3:
                    //Fin del Programa
                    System.out.println("Fin del Programa\n");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.\n");
            }
        }
    }

    public static void ImprimirArrayList(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("---------------------------------------");
            System.out.println(i + ". " + a.get(i).toString());
        }
    }
}
