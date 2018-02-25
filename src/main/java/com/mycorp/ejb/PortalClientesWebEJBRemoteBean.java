package com.mycorp.ejb;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;

import portalclientesweb.ejb.interfaces.PortalClientesWebEJBRemote;
import portalclientesweb.ejb.vo.DatosRetorno;
import util.datos.ActoMedicoConsulta;
import util.datos.ClaveOperativa;
import util.datos.CopagoBean;
import util.datos.DatosClientes;
import util.datos.DatosPersonales;
import util.datos.DetallePoliza;
import util.datos.Formulario;
import util.datos.PolizaBasico;
import util.datos.PrestadorBasico;
import util.datos.PrestadorDetalle;
import util.datos.ReciboConsulta;
import util.datos.ReciboDetalle;
import util.datos.ReembolsoConsulta;
import util.datos.Usuario;
import util.datos.UsuarioAlta;

@Stateless(mappedName = "ejb/PortalClientesWeb")
public class PortalClientesWebEJBRemoteBean implements PortalClientesWebEJBRemote {

	@Override
	public Integer actualizaEstadoPeticion(Integer arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map alta(UsuarioAlta arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatosRetorno altaCliente(String arg0, Long arg1, Long arg2, Timestamp arg3, Integer arg4, String arg5,
			String arg6, String arg7, String arg8, String arg9, String arg10) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatosRetorno altaClienteProspect(String arg0, String arg1, String arg2, String arg3, Timestamp arg4,
			Integer arg5, String arg6, String arg7, String arg8, String arg9, String arg10) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bajaUsuarioWeb(Map arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map buscarActosPoliza(PolizaBasico arg0, ActoMedicoConsulta arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaveOperativa buscarClaveOperativa(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CopagoBean buscarCopagosPoliza(PolizaBasico arg0, String arg1, String arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List buscarCuestionarioDetalle(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List buscarCuestionarioSalud(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List buscarLimites(Map arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List buscarPeriodosCopago(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map buscarPrestadorListaID(List arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map buscarPrestadores(PrestadorBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map buscarRecibos(PolizaBasico arg0, ReciboConsulta arg1, int arg2, int arg3, List arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map buscarReembolsos(PolizaBasico arg0, ReembolsoConsulta arg1, int arg2, int arg3, List arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer calcularFechaPeriodo(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcularPerfilCliente(String arg0, PolizaBasico arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int confirmarRegistro(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PrestadorDetalle detallePrestadores(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map detalleRecibos(ReciboConsulta arg0, ReciboDetalle arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReembolsoConsulta detalleReembolsos(ReembolsoConsulta arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioAlta ejecutarRecordatorioContrasenia(UsuarioAlta arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map fechaUltimaPeticion(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExtractoCopago(Long arg0, Long arg1, Long arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getListaDetallesReembolsos(ReembolsoConsulta arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSecuencia(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map grabaPeticionUsuario(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map grabaPeticionUsuarioDupli(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map grabarDatos(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List guardarNuevoCliente(DatosClientes arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listaBeneficiariosBasica(PolizaBasico arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listaBeneficiariosDetalle(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listaMotivosSolictudTarjeta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listaPaises(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map listaPolizas(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatosRetorno login(String arg0, String arg1, Boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer modificarDatosUsuario(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List obtenerPreexistencias(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatosRetorno recordatorioContrasenya(String arg0, Long arg1, Long arg2, Integer arg3, String arg4,
			Timestamp arg5) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] recuperaMaxNumEnvio(String arg0, String arg1, String arg2) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperaVentajas(Long arg0, Long arg1, Long arg2, Boolean arg3, Boolean arg4, Timestamp arg5,
			String arg6) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperaVentajas(Long arg0, Long arg1, Long arg2, Boolean arg3, Boolean arg4, Timestamp arg5,
			String arg6, Long arg7) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperaVentajas(Long arg0, Long arg1, Long arg2, Boolean arg3, Boolean arg4, Boolean arg5,
			Timestamp arg6, String arg7, Long arg8) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map recuperarAliasUsuario(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formulario recuperarCCC(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarCoberturasCapitales(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarComunidades(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario recuperarContraseniaRecordatorio(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatosPersonales recuperarDatosCliente(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap recuperarDatosClienteRecupContXDNI(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap recuperarDatosClienteXDNI(Long arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetallePoliza recuperarDatosPoliza(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map recuperarDatosTarjeta(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetallePoliza recuperarEmpresaDepartamento(DetallePoliza arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarEstados(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarGeneTablas(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap recuperarListaDatosClienteXDNI(Long arg0, String arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarMunicipios(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map recuperarNombreSucursal(String arg0, String arg1, Formulario arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map recuperarNumTarjetaCliente(String arg0, PolizaBasico arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map recuperarPolizaCorreoTelefono(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetallePoliza recuperarPolizaDireccion(DetallePoliza arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarPrimasAseg(PolizaBasico arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List recuperarProvincias(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map recuperarVersionTarjetaCliente(String arg0, PolizaBasico arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer setExtractoCopago(Long arg0, Long arg1, Long arg2, String arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map solicitudDuplicadoDocumentacion(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map validaAccesoUsuarioDNIAlias(String arg0, String arg1, Boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map validaPeticionUsuario(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map validarAccesoIdCliente(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map validarAccesoUsuario(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario validarDatosRegistro(UsuarioAlta arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int validarTarjeta(long arg0, String arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario validarUsuarioWP(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
