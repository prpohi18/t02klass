public class kodutoo2{
	protected String andmed;
	public kodutoo2(String uusKood){
		andmed=uusKood;
	}
        public String kohanimi(){
            int kood123 = Integer.parseInt(andmed.substring(0,3));
            String kood1234 = "";
            if(kood123 >= 0 && kood123 <= 19 || kood123 >= 60 && kood123 <= 139){
                kood1234 = "GS1 US";
            } else if(kood123 >= 200 && kood123 <= 299) {
                kood1234 = "Restricted distribution (MO defined)";
            } else if(kood123 == 474) {
                kood1234 = "Eesti";
            } else if(kood123 >= 300 && kood123 <= 379) {
                kood1234 = "GS1 France";
            }
            return kood1234;
        }
	/* public int kuunr(){
		return Integer.parseInt(andmed.substring(3,5));
	}
	public int paevanr(){
		return Integer.parseInt(andmed.substring(5,7));
	}
	public String kuunimi(){
		String[] kuunimed={"","jaanuar","veebruar","märts","aprill","mai","juuni","juuli","august","september","oktoober","november","detsember"};
		return kuunimed[kuunr()];
	}
	public int aastanr(){
		int[] aastanr = new int[4];
		aastanr[0] = 1;
		aastanr[2] = Integer.parseInt(andmed.substring(1,2));
		aastanr[3] = Integer.parseInt(andmed.substring(2,3));
		if(Integer.parseInt(andmed.substring(0,1)) > 0 && Integer.parseInt(andmed.substring(0,1)) < 3 ){
			aastanr[1] = 8;
		}else if(Integer.parseInt(andmed.substring(0,1)) > 2 && Integer.parseInt(andmed.substring(0,1)) < 5 ){
			aastanr[1] = 9;
		}else if(Integer.parseInt(andmed.substring(0,1)) > 4 && Integer.parseInt(andmed.substring(0,1)) < 7 ){
			aastanr[0] = 2;
			aastanr[1] = 0;
		}
		int aasta = aastanr[0]*1000 + aastanr[1]*100 + aastanr[2]*10 + aastanr[3];
		return aasta;
	}
    */
	@Override
	public String toString(){
		return "Kohanimi: "+kohanimi();
	}
	}

    /* Riigiprefiks vöötkoodis näitab, millise riigi GS1 organisatsioon on vastava kauba registreerinud.
    Toode ise võib olla valmistatud suvalises maailma riigis. Näiteks kaupluses müüdav 1-kilone suhkrukott prefiksiga 474 ei tähenda,
     et suhkur oleks toodetud Eestis, vaid maaletooja/pakendaja on registreerinud vastava EAN-koodi Eesti registris. */