public class ConverterMoeda {
    private String moedaBase;
    private String moedaAlvo;
    private double taxaConversao;
    private double resultadoConversao;

    public ConverterMoeda(MoedaJson moedaJson){
        this.moedaBase = moedaJson.base_code();
        this.moedaAlvo = moedaJson.target_code();
        this.taxaConversao = Double.valueOf(moedaJson.conversion_rate());
        this.resultadoConversao = Double.valueOf(moedaJson.conversion_result());
    }

    @Override
    public String toString() {
        return "ConverterMoeda{" +
                "moedaBase='" + moedaBase + '\'' +
                ", moedaAlvo='" + moedaAlvo + '\'' +
                ", taxaConversao=" + taxaConversao +
                ", resultadoConversao=" + resultadoConversao +
                '}';
    }
}
