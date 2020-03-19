package com.fairpay.payments.bankVault.binance;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.fairpay.payments.bankVault.binance.dao.BinanceWalletDao;
import com.fairpay.payments.bankVault.binance.model.BinanceWallet;
import com.fairpay.payments.bankVault.dao.CurrencyDao;
import com.fairpay.payments.bankVault.model.Currency;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Init {
    private final BinanceWalletDao binanceWalletDao;
    private final CurrencyDao currencyDao;
    //Временная инициализация кошельков

    private static BinanceApiRestClient binanceApiRestClient;

    //Временный хардкод.
    static {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("ACuEP8vwVDDH8JdT55F10OzuKheh14T962Ald3JccIT78wmrER1AlS8TXIkSeFRW", "KbRJ7zb4Ndpuo6lXFEODvagY5xCJBd2MwpTVJqoHCMYpiCh0GchLUROoTORlLSHi");
        binanceApiRestClient = factory.newRestClient();
    }

//    @PostConstruct
    public void transferTest() {
        System.out.println(binanceApiRestClient.withdraw("USDT", "0xdd77ae61687664019a4154413446da7c0233b6d9", "2.20000000", null, null).getMsg());
    }

//    @PostConstruct
//    @Transactional
//    public void initWallets() {
//        Currency usdt = new Currency("USDT");
//        usdt = currencyDao.save(usdt);
//        BinanceWallet binanceWallet = new BinanceWallet();
//        binanceWallet.setWalletType("BI");
//        binanceWallet.setSite("binance.com");
//        binanceWallet.getCurrencyList().add(usdt);
//        binanceWallet.setApiKey("ACuEP8vwVDDH8JdT55F10OzuKheh14T962Ald3JccIT78wmrER1AlS8TXIkSeFRW");
//        binanceWallet.setSecret("KbRJ7zb4Ndpuo6lXFEODvagY5xCJBd2MwpTVJqoHCMYpiCh0GchLUROoTORlLSHi");
//        binanceWalletDao.save(binanceWallet);
//    }

}
