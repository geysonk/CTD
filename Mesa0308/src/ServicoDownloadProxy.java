public class ServicoDownloadProxy implements Spotfy{

    @Override
    public void fazerDownload(String identificador, String tipoUsuario) {
        if (Usuario.getTipoUsuario().equals("Premium")) {
            System.out.println("Download permitido, assinatura do usuario " + Usuario.getIdentificador()+" verificada!");;
        } else {
            System.out.println("Usuario "+Usuario.getIdentificador()+" nao tem permissao para fazer download, adquira assinatura premium!");
        }
    }
}
