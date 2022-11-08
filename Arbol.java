//Metodos para recorrer pos y pre
  public void recorrerPre(Nodo Raiz){
        System.out.print(Raiz + " ");
        if(Raiz.getLigaI()!=null){
            recorrerPre(Raiz.getLigaI());
        }
        if(Raiz.getLigaD()!=null){
            recorrerPre(Raiz.getLigaD());
        }
    }

    public void recorrerPos(Nodo Raiz){
        if(Raiz.getLigaI()!=null){
            recorrerPos(Raiz.getLigaI());
        }
        if(Raiz.getLigaD()!=null){
            recorrerPos(Raiz.getLigaD());
        }
        System.out.print(Raiz + " ");
    }
    
