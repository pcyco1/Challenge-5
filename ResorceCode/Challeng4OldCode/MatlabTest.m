moment=ones(1,4);
moment=moment.*900;
load=[4.5,5.5,7.5,10.5];

t=[0.396,0.659,0.858,1.03];
v=[0.326,0.491,0.648,0.737,];
rz=1./m.*x;

plot(t,v,'rx','MarkerFaceColor','b','MarkerSize',10)

title("Velocity-Time graph")
xlabel("time(s)")
ylabel("velocity(m/s)")
xlim([0 1.2])
ylim([0 0.8])
grid minor
grid on