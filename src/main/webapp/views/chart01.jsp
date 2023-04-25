<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <%-- //jstl을 쓰겠다는 뜻!!
c 로 쓰겠다는것, 그래서 밑에 c:out  으로 쓸 수 있음--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
    let chart01 ={
        init: function(){
            this.getdata();
        },
        getdata: function(){
            $.ajax({
                url:'chart01',
                success:function(result){
                    chart01.display(result);
                }
            });
        },
        display: function(result){
            Highcharts.chart('c1', {

                title: {
                    text: ''
                },
                xAxis: {
                    tickInterval: 1,
                    type: 'logarithmic',
                    accessibility: {
                        rangeDescription: 'Range: 1 to 10'
                    }
                },
                yAxis: {
                    type: 'logarithmic',
                    minorTickInterval: 0.1,
                    accessibility: {
                        rangeDescription: 'Range: 0.1 to 1000'
                    }
                },

                tooltip: {
                    headerFormat: '<b>{series.name}</b><br />',
                    pointFormat: 'x = {point.x}, y = {point.y}'
                },

                series: [{
                    data: result,
                    pointStart: 1
                }]
            });
        },
    };
    $(function(){
        chart01.init();
    })
</script>

<!-- Area Chart -->
<div class="col-xl-8 col-lg-7">
    <div class="card shadow mb-4">
        <!-- Card Header - Dropdown -->
        <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
            <h6 class="m-0 font-weight-bold text-primary">이차트를 바꿔보쟈!!!!!!!되는지보쟈!</h6>
            <%--                    <div class="dropdown no-arrow">--%>
            <%--                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"--%>
            <%--                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
            <%--                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>--%>
            <%--                        </a>--%>
            <%--                        <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"--%>
            <%--                             aria-labelledby="dropdownMenuLink">--%>
            <%--                            <div class="dropdown-header">Dropdown Header:</div>--%>
            <%--                            <a class="dropdown-item" href="#">Action</a>--%>
            <%--                            <a class="dropdown-item" href="#">Another action</a>--%>
            <%--                            <div class="dropdown-divider"></div>--%>
            <%--                            <a class="dropdown-item" href="#">Something else here</a>--%>
            <%--                        </div>--%>
            <%--                    </div>--%>
        </div>

        <div class="card-body">
            <div class="chart-area" id="c1">
                <%--                        <canvas id="myAreaChart"></canvas>--%>
            </div>
        </div>
    </div>
</div>