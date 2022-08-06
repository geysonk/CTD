import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UsuarioTest {


    @Test
    public void testUsuario() {
        Spotfy ServicoDownload = new ServicoDownloadProxy();

        Usuario usuario1 = new Usuario("i472498", "Premium");
        ServicoDownload.fazerDownload(usuario1.getIdentificador(), usuario1.getTipoUsuario());

        Usuario usuario2 = new Usuario("i472499", "Free");
        ServicoDownload.fazerDownload(usuario2.getIdentificador(), usuario2.getTipoUsuario());

        Usuario usuario3 = new Usuario("i472410", "Free");
        ServicoDownload.fazerDownload(usuario2.getIdentificador(), usuario2.getTipoUsuario());

    }
}
