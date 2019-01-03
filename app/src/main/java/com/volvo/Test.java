package com.volvo;

import java.util.List;

public class Test {


  /**
   * status : true
   * code : 200
   * msg :
   * currpage : 1
   * maxpage : 2
   * data : [{"code":"bitmex","name":"BitMEX","logo":"https://s1.feixiaohao.com/image/20181126/bitmex_webpmid.webp","volume":2.8652794843316E9,"pair_num":8,"attention_num":2394,"country":"塞舌尔","ratings":4,"provide_exchange":"futures","name_zh":"BitMEX","is_innovation":0,"is_share":0},{"code":"bithumb","name":"Bithumb","logo":"https://s1.feixiaohao.com/image/20181120/bithumb_webpmid.webp","volume":1.48066738934E9,"pair_num":53,"attention_num":1459,"country":"韩国","ratings":5,"provide_exchange":"fiat,spot","name_zh":"Bithumb","is_innovation":0,"is_share":0},{"code":"binance","name":"Binance","logo":"https://s1.feixiaohao.com/image/20181207/binance_webpmid.webp","volume":1.10421407871E9,"pair_num":394,"attention_num":17721,"country":"未知","ratings":5,"provide_exchange":"spot","name_zh":"币安网","is_innovation":0,"is_share":0},{"code":"okex","name":"OKEX","logo":"https://s1.feixiaohao.com/image/20181115/okex_webpmid.webp","volume":9.06291892448478E8,"pair_num":435,"attention_num":17952,"country":"马耳他","ratings":4,"provide_exchange":"futures,otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"huobipro","name":"Huobi","logo":"https://s1.feixiaohao.com/image/20181119/huobipro_webpmid.webp","volume":7.236798803E8,"pair_num":392,"attention_num":19256,"country":"塞舌尔","ratings":5,"provide_exchange":"futures,otc,spot","name_zh":"火币全球站","is_innovation":0,"is_share":0},{"code":"bit-z","name":"Bit-Z","logo":"https://s1.feixiaohao.com/image/20181119/bitz_webpmid.webp","volume":3.870506717728E8,"pair_num":139,"attention_num":7136,"country":"中国香港","ratings":2,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"bitfinex","name":"Bitfinex","logo":"https://s1.feixiaohao.com/image/20181126/bitfinex_webpmid.webp","volume":3.556482637226E8,"pair_num":222,"attention_num":10794,"country":"中国香港","ratings":5,"provide_exchange":"fiat,futures,spot","name_zh":"Bitfinex","is_innovation":0,"is_share":0},{"code":"upbit","name":"Upbit","logo":"https://s1.feixiaohao.com/image/20181119/upbit_webpmid.webp","volume":3.5133744963E8,"pair_num":293,"attention_num":9696,"country":"韩国","ratings":4,"provide_exchange":"fiat,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"hitbtc","name":"HitBTC","logo":"https://s1.feixiaohao.com/image/20181126/hitbtc_webpmid.webp","volume":3.3309272543816537E8,"pair_num":616,"attention_num":841,"country":"英国","ratings":4,"provide_exchange":"spot","name_zh":"HitBTC","is_innovation":0,"is_share":0},{"code":"bibox","name":"Bibox","logo":"https://s1.feixiaohao.com/image/20181126/bibox_webpmid.webp","volume":3.275546660461E8,"pair_num":198,"attention_num":6138,"country":"爱沙尼亚","ratings":4,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"shuzibi","name":"DigiFinex","logo":"https://s1.feixiaohao.com/image/20181119/shuzibi_webpmid.webp","volume":3.172106936787E8,"pair_num":102,"attention_num":4224,"country":"塞舌尔","ratings":3,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"zb","name":"ZB","logo":"https://s1.feixiaohao.com/image/20181119/zb_webpmid.webp","volume":3.0472601800198E8,"pair_num":137,"attention_num":20838,"country":"萨摩亚","ratings":4,"provide_exchange":"otc,spot","name_zh":"ZB网","is_innovation":0,"is_share":0},{"code":"fcoin","name":"FCoin","logo":"https://s1.feixiaohao.com/image/20181119/fcoin_webpmid.webp","volume":1.861977633742E8,"pair_num":115,"attention_num":11578,"country":"未知","ratings":4,"provide_exchange":"spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"coinbasepro","name":"Coinbase Pro","logo":"https://s1.feixiaohao.com/image/20181123/coinbasepro_webpmid.webp","volume":1.8341663667E8,"pair_num":30,"attention_num":376,"country":"美国","ratings":4,"provide_exchange":"fiat,spot","name_zh":"Coinbase Pro","is_innovation":0,"is_share":0},{"code":"kraken","name":"Kraken","logo":"https://s1.feixiaohao.com/image/20181119/kraken_webpmid.webp","volume":1.828213365943E8,"pair_num":64,"attention_num":4801,"country":"美国","ratings":3,"provide_exchange":"fiat,spot","name_zh":"K网","is_innovation":0,"is_share":0},{"code":"coinw","name":"Coinw","logo":"https://s1.feixiaohao.com/image/20181119/coinw_webpmid.webp","volume":1.782101302743E8,"pair_num":43,"attention_num":608,"country":"中国香港","ratings":3,"provide_exchange":"otc,spot","name_zh":"币赢国际站","is_innovation":0,"is_share":0},{"code":"bitbank","name":"Bitbank","logo":"https://s1.feixiaohao.com/image/20181119/bitbank_webpmid.webp","volume":1.7268055894E8,"pair_num":8,"attention_num":62,"country":"日本","ratings":3,"provide_exchange":"fiat,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"idax","name":"IDAX","logo":"https://s1.feixiaohao.com/image/20181124/idax_webpmid.webp","volume":1.671797750615E8,"pair_num":95,"attention_num":6257,"country":"蒙古国","ratings":3,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"liquid","name":"Liquid","logo":"https://s1.feixiaohao.com/image/20181119/liquid_webpmid.webp","volume":1.646403574172E8,"pair_num":68,"attention_num":11,"country":"日本","ratings":4,"provide_exchange":"fiat,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"fubt","name":"Hong Kong FUBT","logo":"https://s1.feixiaohao.com/image/20181124/fubt_webpmid.webp","volume":1.521560548495E8,"pair_num":64,"attention_num":10340,"country":"中国香港","ratings":1,"provide_exchange":"otc,spot","name_zh":"香港富比特","is_innovation":0,"is_share":0},{"code":"aex","name":"Bit.cc","logo":"https://s1.feixiaohao.com/image/20181119/aex_webpmid.webp","volume":1.4785315313E8,"pair_num":80,"attention_num":391,"country":"英国","ratings":3,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"dragonex","name":"DragonEx","logo":"https://s1.feixiaohao.com/image/20181119/dragonex_webpmid.webp","volume":1.334188416862E8,"pair_num":60,"attention_num":4644,"country":"新加坡","ratings":3,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"hb_top","name":"HB.top","logo":"https://s1.feixiaohao.com/image/20181119/hbtop_webpmid.webp","volume":1.1170430228E8,"pair_num":35,"attention_num":10225,"country":"中国香港","ratings":2,"provide_exchange":"otc,spot","name_zh":"汇币网","is_innovation":0,"is_share":0},{"code":"bitker","name":"BITKER","logo":"https://s1.feixiaohao.com/image/20181126/bitker_webpmid.webp","volume":1.091827285869E8,"pair_num":36,"attention_num":1013,"country":"新加坡","ratings":1,"provide_exchange":"futures,otc,spot","name_zh":"币客","is_innovation":0,"is_share":0},{"code":"zgtop","name":"ZG.TOP","logo":"https://s1.feixiaohao.com/image/20181126/zgtop_webpmid.webp","volume":9.27314826823E7,"pair_num":41,"attention_num":3454,"country":"蒙古国","ratings":1,"provide_exchange":"spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"bitstamp","name":"Bitstamp","logo":"https://s1.feixiaohao.com/image/20181119/bitstamp_webpmid.webp","volume":8.975141447E7,"pair_num":11,"attention_num":133,"country":"英国","ratings":4,"provide_exchange":"fiat,spot","name_zh":"Bitstamp","is_innovation":0,"is_share":0},{"code":"cointiger","name":"CoinTiger","logo":"https://s1.feixiaohao.com/image/20181119/cointiger_webpmid.webp","volume":8.81547232897E7,"pair_num":79,"attention_num":5433,"country":"新加坡","ratings":2,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"gate-io","name":"gate.io","logo":"https://s1.feixiaohao.com/image/20181204/gateio_webpmid.webp","volume":8.34902800232E7,"pair_num":345,"attention_num":11535,"country":"开曼群岛","ratings":4,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"bihuex","name":"BihuEX","logo":"https://s1.feixiaohao.com/image/20181123/bihuex_webpmid.webp","volume":7.17913855728E7,"pair_num":17,"attention_num":689,"country":"开曼群岛","ratings":1,"provide_exchange":"futures,otc,spot","name_zh":"币虎全球BihuEX","is_innovation":0,"is_share":0},{"code":"idcm","name":"IDCM","logo":"https://s1.feixiaohao.com/image/20181124/idcm_webpmid.webp","volume":5.93745964774E7,"pair_num":39,"attention_num":10468,"country":"塞舌尔","ratings":2,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"yoexs","name":"YOEXS","logo":"https://s1.feixiaohao.com/image/20181119/yoexs_webpmid.webp","volume":5.792580052E7,"pair_num":57,"attention_num":370,"country":"开曼群岛","ratings":2,"provide_exchange":"fiat,otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"bittrex","name":"Bittrex","logo":"https://s1.feixiaohao.com/image/20181127/bittrex_webpmid.webp","volume":5.56793822336E7,"pair_num":287,"attention_num":401,"country":"美国","ratings":5,"provide_exchange":"futures,spot","name_zh":"B网","is_innovation":0,"is_share":0},{"code":"allcoin","name":"Allcoin","logo":"https://s1.feixiaohao.com/image/20181119/allcoin_webpmid.webp","volume":5.4415585170443E7,"pair_num":33,"attention_num":3022,"country":"中国香港","ratings":2,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"bione","name":"BIONE","logo":"https://s1.feixiaohao.com/image/20181130/bione_webpmid.webp","volume":5.37388766071E7,"pair_num":17,"attention_num":1335,"country":"新加坡","ratings":1,"provide_exchange":"otc,spot","name_zh":"币万","is_innovation":0,"is_share":0},{"code":"hubi","name":"Hubi","logo":"https://s1.feixiaohao.com/image/20181204/hubi_webpmid.webp","volume":5.095824155E7,"pair_num":25,"attention_num":6107,"country":"中国香港","ratings":1,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"bitflyer","name":"bitFlyer","logo":"https://s1.feixiaohao.com/image/20181119/bitflyer_webpmid.webp","volume":4.724617051E7,"pair_num":4,"attention_num":81,"country":"日本","ratings":4,"provide_exchange":"fiat,futures,spot","name_zh":"bitFlyer","is_innovation":0,"is_share":0},{"code":"dfex","name":"DFEX","logo":"https://s1.feixiaohao.com/image/20181204/dfex_webpmid.webp","volume":4.529568613E7,"pair_num":14,"attention_num":20,"country":"新加坡","ratings":1,"provide_exchange":"otc,spot","name_zh":"东方交易所","is_innovation":0,"is_share":0},{"code":"gemini","name":"Gemini","logo":"https://s1.feixiaohao.com/image/20181126/gemini_webpmid.webp","volume":4.046831692E7,"pair_num":6,"attention_num":64,"country":"美国","ratings":4,"provide_exchange":"spot","name_zh":"双子星","is_innovation":0,"is_share":0},{"code":"chaoex","name":"CHAOEX","logo":"https://s1.feixiaohao.com/image/20181126/chaoex_webpmid.webp","volume":3.943587005E7,"pair_num":35,"attention_num":73,"country":"爱沙尼亚","ratings":3,"provide_exchange":"otc,spot","name_zh":"炒客网","is_innovation":0,"is_share":0},{"code":"poloniex","name":"Poloniex","logo":"https://s1.feixiaohao.com/image/20181126/poloniex_webpmid.webp","volume":3.87063164422E7,"pair_num":114,"attention_num":243,"country":"美国","ratings":5,"provide_exchange":"spot","name_zh":"P网","is_innovation":0,"is_share":0},{"code":"coinbene","name":"CoinBene","logo":"https://s1.feixiaohao.com/image/20181126/coinbene_webpmid.webp","volume":3.81432452421E7,"pair_num":123,"attention_num":234,"country":"新加坡","ratings":2,"provide_exchange":"otc,sharing,spot","name_zh":"满币网","is_innovation":0,"is_share":1},{"code":"qbtc","name":"QBTC","logo":"https://s1.feixiaohao.com/image/20181124/qbtc_webpmid.webp","volume":3.684731381E7,"pair_num":67,"attention_num":224,"country":"开曼群岛","ratings":2,"provide_exchange":"spot","name_zh":"Q网","is_innovation":0,"is_share":0},{"code":"fatbtc","name":"FatBTC","logo":"https://s1.feixiaohao.com/image/20181126/fatbtc_webpmid.webp","volume":3.328246733E7,"pair_num":26,"attention_num":5244,"country":"美国","ratings":4,"provide_exchange":"spot","name_zh":"胖比特","is_innovation":0,"is_share":0},{"code":"zzex","name":"ZZEX","logo":"https://s1.feixiaohao.com/image/20181124/zzex_webpmid.webp","volume":3.0161414942E7,"pair_num":27,"attention_num":233,"country":"新加坡","ratings":1,"provide_exchange":"otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"coinone","name":"Coinone","logo":"https://s1.feixiaohao.com/image/20181127/coinone_webpmid.webp","volume":2.565306422E7,"pair_num":15,"attention_num":59,"country":"韩国","ratings":4,"provide_exchange":"fiat,spot","name_zh":"Coinone","is_innovation":0,"is_share":0},{"code":"bcex","name":"BCEX","logo":"https://s1.feixiaohao.com/image/20181119/bcex_webpmid.webp","volume":2.49419261458E7,"pair_num":53,"attention_num":5556,"country":"加拿大","ratings":3,"provide_exchange":"futures,otc,spot","name_zh":"","is_innovation":0,"is_share":0},{"code":"coincheck","name":"Coincheck","logo":"https://s1.feixiaohao.com/image/20181124/coincheck_webpmid.webp","volume":2.080605932E7,"pair_num":1,"attention_num":0,"country":"日本","ratings":3,"provide_exchange":"fiat,spot","name_zh":"Coincheck","is_innovation":0,"is_share":0},{"code":"itbit","name":"itBit","logo":"https://s1.feixiaohao.com/image/20181126/itbit_webpmid.webp","volume":2.017771646E7,"pair_num":1,"attention_num":15,"country":"美国","ratings":2,"provide_exchange":"spot","name_zh":"itBit","is_innovation":0,"is_share":0},{"code":"at3","name":"AT Exchange","logo":"https://s1.feixiaohao.com/image/20181122/at3_webpmid.webp","volume":1.949362799134E7,"pair_num":15,"attention_num":183,"country":"新加坡","ratings":1,"provide_exchange":"otc,spot","name_zh":"AT交易所","is_innovation":0,"is_share":0},{"code":"exmo","name":"Exmo","logo":"https://s1.feixiaohao.com/image/20181124/exmo_webpmid.webp","volume":1.7141581885E7,"pair_num":90,"attention_num":34,"country":"西班牙","ratings":2,"provide_exchange":"fiat,spot","name_zh":"Exmo","is_innovation":0,"is_share":0}]
   */

  private String status;
  private String code;
  private String msg;
  private int currpage;
  private int maxpage;
  private List<DataBean> data;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public int getCurrpage() {
    return currpage;
  }

  public void setCurrpage(int currpage) {
    this.currpage = currpage;
  }

  public int getMaxpage() {
    return maxpage;
  }

  public void setMaxpage(int maxpage) {
    this.maxpage = maxpage;
  }

  public List<DataBean> getData() {
    return data;
  }

  public void setData(List<DataBean> data) {
    this.data = data;
  }

  public static class DataBean {
    /**
     * code : bitmex
     * name : BitMEX
     * logo : https://s1.feixiaohao.com/image/20181126/bitmex_webpmid.webp
     * volume : 2.8652794843316E9
     * pair_num : 8
     * attention_num : 2394
     * country : 塞舌尔
     * ratings : 4
     * provide_exchange : futures
     * name_zh : BitMEX
     * is_innovation : 0
     * is_share : 0
     */

    private String code;
    private String name;
    private String logo;
    private double volume;
    private int pair_num;
    private int attention_num;
    private String country;
    private int ratings;
    private String provide_exchange;
    private String name_zh;
    private int is_innovation;
    private int is_share;

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getLogo() {
      return logo;
    }

    public void setLogo(String logo) {
      this.logo = logo;
    }

    public double getVolume() {
      return volume;
    }

    public void setVolume(double volume) {
      this.volume = volume;
    }

    public int getPair_num() {
      return pair_num;
    }

    public void setPair_num(int pair_num) {
      this.pair_num = pair_num;
    }

    public int getAttention_num() {
      return attention_num;
    }

    public void setAttention_num(int attention_num) {
      this.attention_num = attention_num;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public int getRatings() {
      return ratings;
    }

    public void setRatings(int ratings) {
      this.ratings = ratings;
    }

    public String getProvide_exchange() {
      return provide_exchange;
    }

    public void setProvide_exchange(String provide_exchange) {
      this.provide_exchange = provide_exchange;
    }

    public String getName_zh() {
      return name_zh;
    }

    public void setName_zh(String name_zh) {
      this.name_zh = name_zh;
    }

    public int getIs_innovation() {
      return is_innovation;
    }

    public void setIs_innovation(int is_innovation) {
      this.is_innovation = is_innovation;
    }

    public int getIs_share() {
      return is_share;
    }

    public void setIs_share(int is_share) {
      this.is_share = is_share;
    }
  }
}
