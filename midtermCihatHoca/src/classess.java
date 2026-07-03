public class classess {
}

// Alt Seviye Modül (Detay)
class EmailService {
    public void sendEmail(String message) {
        System.out.println("E-posta gönderiliyor: " + message);
    }
}

class SmsService{
    public void sendMessage(String message){
        System.out.println("SMS gönderiliyor: "+message);
    }
}

class WhatsappService{
    public void sendWhatsappMessage(String message){
        System.out.println("Whatsapp mesajı gönderiliyor: "+message);
    }
}

// Üst Seviye Modül (Politika)
class Notification {
    private EmailService emailService; // HATA: Somut sınıfa bağımlılık! [cite: 1677]
    private SmsService messageService=new SmsService();
    private WhatsappService wpmessageservice;

    public Notification() {
        this.emailService = new EmailService();// Sıkı sıkıya bağlı
        this.messageService=new SmsService();
        this.wpmessageservice=new WhatsappService();
    }

    public void notifyUser(String text) {
        wpmessageservice.sendWhatsappMessage(text);
    }
}