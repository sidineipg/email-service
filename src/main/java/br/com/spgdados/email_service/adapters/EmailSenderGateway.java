package br.com.spgdados.email_service.adapters;

public interface EmailSenderGateway {

    void sendEmai(String to, String subject, String body);
}
