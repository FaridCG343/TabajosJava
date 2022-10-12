Scanner teclado = new Scanner(System.in);
        String exp = teclado.nextLine();
        String[] xd = exp.split("[-/*+()]");
        String[] xd2 = exp.split("[0-9a-zA-Z]+");
        for(String string : xd) {
            System.out.println(string);
        }
        System.out.println(xd2.length);
        for(String str: xd2){
            System.out.println(str);
        }
            
