package org.itstep.msk.app.entity.enums;

public enum TypeTransaction {
    /**
     * пополнение через банкамат
     */
    ACCOUNT_REPLENISHMENT,
    /**
     * снятие денег через банкомат
     */
    WITHDRAWAL,
    /**
     * перевод на другой счет
     */
    TRANSFER_TO_ANOTHER_ACCOUNT,
    /**
     * получение с другова счета
     */
    RECEIVING_FROM_AN_ACCOUNT
}
