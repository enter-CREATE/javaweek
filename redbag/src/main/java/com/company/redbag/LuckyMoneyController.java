package com.company.redbag;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController//注解相当于@Controller+@ResponseBody
@RequestMapping("/bag")
public class LuckyMoneyController {
    @Autowired
    private LuckyMoneyRepository repository;

    /**
     * 获取红包列表
     * @return
     */
    @GetMapping("/list")
    public List<LuckyMoney> list(){
        return repository.findAll();
    }

    /**
     * 发红包
     * @param producer
     * @param money
     * @return
     */
    @PostMapping("/post")
    public LuckyMoney postRedBag(@RequestParam(value = "producer",required = true)String producer, @RequestParam(value = "money",required = true)BigDecimal money){
        LuckyMoney luckyMoney=new LuckyMoney();
        luckyMoney.setProducer(producer);
        luckyMoney.setMoney(money);
        return repository.save(luckyMoney);
    }

    /**
     * 根据id查红包
     * @param id
     * @return
     */
    @GetMapping("/find/{id}")
    public LuckyMoney findById(@PathVariable("id") Integer id){
//        Optional<LuckyMoney> optional = repository.findById(id);
//        if (optional.isPresent()){
//            LuckyMoney luckyMoney = optional.get();
//            return luckyMoney;
//        }
//        return null;
        //如果有就返回，没有就返回other
        return repository.findById(id).orElse(null);
    }

    /**
     * 收红包
     * @param id
     * @param consumer
     * @return LuckMoney
     */
    @PutMapping("/put/{id}")
    public LuckyMoney put(@PathVariable("id")Integer id,
                          @RequestParam("consumer") String consumer){
        Optional<LuckyMoney> optional = repository.findById(id);
        if (optional.isPresent()){
            LuckyMoney luckyMoney=optional.get();
            luckyMoney.setConsumer(consumer);
            return repository.save(luckyMoney);
        }
        return null;
    }
}