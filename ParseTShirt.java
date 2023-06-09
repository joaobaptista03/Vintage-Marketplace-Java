public class ParseTShirt {
    public static TShirt parse(String[] parse) {
        Artigo.Condicao condicao;
            if (parse[2].equalsIgnoreCase("novo")) condicao = Artigo.Condicao.novo;
            else condicao = Artigo.Condicao.usado;

        TShirt.Tamanho tamanho;
            if (parse[11].equalsIgnoreCase("S")) tamanho = TShirt.Tamanho.S;
            else if (parse[11].equalsIgnoreCase("M")) tamanho = TShirt.Tamanho.M;
            else if (parse[11].equalsIgnoreCase("L")) tamanho = TShirt.Tamanho.L;
            else tamanho = TShirt.Tamanho.XL;

        TShirt.Padrao padrao;
            if (parse[12].equalsIgnoreCase("liso")) padrao = TShirt.Padrao.liso;
            else if (parse[12].equalsIgnoreCase("riscas")) padrao = TShirt.Padrao.riscas;
            else padrao = TShirt.Padrao.palmeiras;

        return new TShirt(
                Integer.parseInt(parse[1]),
                condicao,
                Float.parseFloat(parse[3]),
                Integer.parseInt(parse[4]),
                parse[5],
                parse[6],
                parse[7],
                Float.parseFloat(parse[8]),
                Float.parseFloat(parse[9]),
                parse[10],
                tamanho,
                padrao
        );
    }
}
