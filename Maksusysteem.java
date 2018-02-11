public class Maksusysteem{
	protected String nimi;
	protected double p6hipalk;
	protected double lisatasud;
	protected double preemia;
	
	//Fikseeritud tulumaks: kogu palgast maksta fikseeritud protsent makse.
	public double fikseeritud(int fiks_protsent){
		double palk_kokku=p6hipalk+lisatasud+preemia;
		double maksud=palk_kokku*fiks_protsent/100;
		double raha_k2tte=palk_kokku-maksud;
		return raha_k2tte;
	}
	
	//Kombineeritud tulumaks: põhipalgast maksta (p6hi_protsent %) makse, 
	//lisatasudelt (lisa_protsent %) makse ja preemialt (preemia_protsent %) makse.
	public double kombineeritud(int p6hi_protsent, int lisa_protsent, int preemia_protsent){
		double palk_kokku=p6hipalk+lisatasud+preemia;
		double maksud_p6hipalgalt=p6hipalk*p6hi_protsent/100;
		double maksud_lisatasudelt=lisatasud*lisa_protsent/100;
		double maksud_preemialt=preemia*preemia_protsent/100;
		double raha_k2tte=palk_kokku-maksud_p6hipalgalt-maksud_lisatasudelt-maksud_preemialt;
		return raha_k2tte;
	}
	
	//Astmeline tulumaks (kogu palgast maksta makse palgaastmete järgi):
	//Alla 1000 eurose palga pealt maksta (aste1 %) makse.
	//1000 eurose kuni 2000 eurose palga pealt maksta (aste2 %) makse.
	//Üle 2000 eurose kuni 5000 eurose palga pealt maksta (aste3 %) makse.
	//Üle 5000 eurose palga pealt maksta (aste4 %) makse.
	public double astmeline(int aste1, int aste2, int aste3, int aste4){
		double palk_kokku=p6hipalk+lisatasud+preemia;
		if(palk_kokku<1000){
			double maksud=palk_kokku*aste1/100;
			double raha_k2tte=palk_kokku-maksud;
			return raha_k2tte;
		}else if(palk_kokku>=1000 && palk_kokku<=2000){
			double maksud=palk_kokku*aste2/100;
			double raha_k2tte=palk_kokku-maksud;
			return raha_k2tte;
		}else if(palk_kokku>2000 && palk_kokku<=5000){
			double maksud=palk_kokku*aste3/100;
			double raha_k2tte=palk_kokku-maksud;
			return raha_k2tte;
		}else if(palk_kokku>5000){
			double maksud=palk_kokku*aste4/100;
			double raha_k2tte=palk_kokku-maksud;
			return raha_k2tte;
		}
		return 0;
	}
}