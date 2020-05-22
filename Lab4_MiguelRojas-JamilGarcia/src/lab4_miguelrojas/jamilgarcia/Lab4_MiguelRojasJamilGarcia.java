package lab4_miguelrojas.jamilgarcia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_MiguelRojasJamilGarcia {

    static ArrayList<String> lista_usuarios = new ArrayList();
    static ArrayList<Ingenieros> lista_ingenieros = new ArrayList();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
                            //Agregar a lista de idiomas
                            //Recorrer lista de idiomas, si ya existe no agrega y manda mensaje
                        }
                        if (op_idioma == 2) {
                            //Agregar a lista de idiomas
                        }
                        if (op_idioma == 3) {
                            //Agregar a lista de idiomas
                        }
                        if (op_idioma == 4) {
                            //Agregar a lista de idiomas
                        }
                        if (op_idioma == 5) {
                            //Agregar a lista de idiomas
                        }

                        System.out.print("Desea agregar otro idioma?\n"
                                + "[1] Si\n"
                                + "[2] No\n"
                                + "Eliga una opcion: ");
                        int op_seguir = sc.nextInt();
                        sc = new Scanner(System.in);

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

                    //Crear el Objeto Ingeniero
                    //Agregar a lista de Ingenieros
                    System.out.println("Se registro exitosamente!!\n");
                    break;
                case 2:
                    //Menu de Ingenieros - Todo
                    System.out.print("----------------\n"
                            + "Iniciar Sesion\n\n"
                            + "Ingrese su usuario: ");
                    String usuario = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println();
                    break;
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

}
