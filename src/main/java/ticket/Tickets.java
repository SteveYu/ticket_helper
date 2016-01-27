package ticket;

public class Tickets {
	private boolean flag;
	private String searchDate;
	private Ticket[] datas;

	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getSearchData() {
		return searchDate;
	}
	public void setSearchData(String searchData) {
		this.searchDate = searchData;
	}
	public Ticket[] getDatas() {
		return datas;
	}
	public void setDatas(Ticket[] ticketList) {
		this.datas = ticketList;
	}

	public boolean haveTicket() {
		boolean haveTicket = false;
		for(Ticket t : datas) {
			if(t.canBuy()) {
				haveTicket = true;
				break;
			}
		}
		
		return haveTicket;
	}
	
	public void outputAvailableTickets() {
		System.out.println("车次\t出发站-到达站\t\t出发时间-到达时间\t\t商务座\t一等座\t二等座\t软卧\t硬卧\t硬座\t无座");
		for(Ticket t : datas) {
			if(t.canBuy()) {
				System.out.println(t.toString());
			}
		}
	}
}
