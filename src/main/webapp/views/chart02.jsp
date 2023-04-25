<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <%-- //jstl을 쓰겠다는 뜻!!
c 로 쓰겠다는것, 그래서 밑에 c:out  으로 쓸 수 있음--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
  let chart02={
    init:function(){
      this.getdata();
    },
    getdata:function(){
      $.ajax({
        url:'/chart02',
        success:function(result){
          chart02.display(result);
        }
      });
    },
    display:function(result){
      Highcharts.chart('c2', {
        chart: {
          type: 'pie',
          options3d: {
            enabled: true,
            alpha: 45
          }
        },
        title: {
          text: '',
          align: 'left'
        },
        subtitle: {
          text: '',
          align: 'left'
        },
        plotOptions: {
          pie: {
            innerSize: 100,
            depth: 45
          }
        },
        series: [{
          name: 'Medals',
          data: result
        }]
      });
    }
  };

  $(function(){
    chart02.init();
  })

</script>

<!-- Pie Chart -->
<div class="col-xl-4 col-lg-5">
    <div class="card shadow mb-4">
        <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
        <h6 class="m-0 font-weight-bold text-primary">두번째 도넛차트</h6>
        </div>
        <div id="c2"></div>
    </div>
</div>